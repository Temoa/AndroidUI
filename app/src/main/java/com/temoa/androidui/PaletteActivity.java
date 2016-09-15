package com.temoa.androidui;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PaletteActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private String code = "" +
            "/**\n" +
            "     * Vibrant         充满活力的\n" +
            "     * Vibrant dark    充满活力的黑\n" +
            "     * Vibrant light   充满活力的亮\n" +
            "     * Muted           柔和的\n" +
            "     * Muted dark      柔和的黑\n" +
            "     * Muted light     柔和的亮\n" +
            "     */" +
            "Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {\n" +
            "            @Override\n" +
            "            public void onGenerated(Palette palette) {\n" +
            "                Palette.Swatch vibrant = palette.getVibrantSwatch();\n" +
            "                Palette.Swatch vibrantDark = palette.getDarkVibrantSwatch();\n" +
            "                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(vibrant.getRgb()));\n" +
            "                btn.setBackgroundColor(vibrant.getRgb());\n" +
            "                getWindow().setStatusBarColor(vibrantDark.getRgb());\n" +
            "            }\n" +
            "        });";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView img1 = (ImageView) findViewById(R.id.palette_img_1);
        ImageView img2 = (ImageView) findViewById(R.id.palette_img_2);
        ImageView img3 = (ImageView) findViewById(R.id.palette_img_3);
        btn = (Button) findViewById(R.id.palette_btn);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        btn.setOnClickListener(this);
    }

    /**
     * Vibrant         充满活力的
     * Vibrant dark    充满活力的黑
     * Vibrant light   充满活力的亮
     * Muted           柔和的
     * Muted dark      柔和的黑
     * Muted light     柔和的亮
     */
    private void getPaletteColor(Bitmap bitmap) {
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onGenerated(Palette palette) {
                Palette.Swatch vibrant = palette.getVibrantSwatch();
                Palette.Swatch vibrantDark = palette.getDarkVibrantSwatch();
                if (vibrant != null) {
                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(vibrant.getRgb()));
                    btn.setBackgroundColor(vibrant.getRgb());
                }
                if (vibrantDark != null) {
                    getWindow().setStatusBarColor(vibrantDark.getRgb());
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.palette_img_1:
                Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.pic);
                getPaletteColor(bitmap1);
                break;
            case R.id.palette_img_2:
                Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.pic2);
                getPaletteColor(bitmap2);
                break;
            case R.id.palette_img_3:
                Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.pic3);
                getPaletteColor(bitmap3);
                break;
            case R.id.palette_btn:
                AlertDialog.Builder builder = new AlertDialog.Builder(this)
                        .setTitle("示例代码")
                        .setMessage(code);
                AlertDialog dialog = builder.create();
                dialog.show();
                break;
        }
    }
}
