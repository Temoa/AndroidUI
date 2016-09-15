package com.temoa.androidui;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewOutlineProvider;

public class ClippingActivity extends AppCompatActivity {

    private String say = "" +
            "第一,二个是带阴影的textView,第三个是imageView,如果需要裁剪其中的内容(其他的view也一样),需要设置\n" +
            "setClipToOutline(true);\n" +
            "--------------------------------------------\n\n";

    private String code = "Java Code:\n" +
            "ViewOutlineProvider viewOutlineProviderRec = new ViewOutlineProvider() {\n" +
            "            @Override\n" +
            "            public void getOutline(View view, Outline outline) {\n" +
            "                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 30);\n" +
            "            }\n" +
            "        };\n" +
            "ViewOutlineProvider viewOutlineProvider1Cycle = new ViewOutlineProvider() {\n" +
            "            @Override\n" +
            "            public void getOutline(View view, Outline outline) {\n" +
            "                outline.setOval(0, 0, view.getWidth(), view.getHeight());\n" +
            "            }\n" +
            "        };\n" +
            "view1.setOutlineProvider(viewOutlineProviderRec);\n" +
            "view2.setOutlineProvider(viewOutlineProvider1Cycle);\n";

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipping);

        View view1 = findViewById(R.id.clipping_tv_rec);
        View view2 = findViewById(R.id.clipping_tv_cycle);
        View view3 = findViewById(R.id.clipping_img);

        ViewOutlineProvider viewOutlineProviderRec = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 30);
            }
        };
        ViewOutlineProvider viewOutlineProvider1Cycle = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
            }
        };

        view1.setOutlineProvider(viewOutlineProviderRec);
        view2.setOutlineProvider(viewOutlineProvider1Cycle);
        view3.setOutlineProvider(viewOutlineProvider1Cycle);
        view3.setClipToOutline(true);

        findViewById(R.id.clipping_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ClippingActivity.this)
                        .setTitle("示例代码")
                        .setMessage(say + code);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
