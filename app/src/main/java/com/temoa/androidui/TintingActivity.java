package com.temoa.androidui;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TintingActivity extends AppCompatActivity {
    private String code = "" +
            "tint为颜色\n" +
            "tintMode为:\n" +
            "add        覆盖\n" +
            "multiply   取两图层交集部分叠加后颜色\n" +
            "screen     取两图层全部区域，交集部分变为透明色\n" +
            "src_atop   取下层非交集部分与上层交集部分\n" +
            "src_in     取两层绘制交集。显示上层\n" +
            "src_over   正常绘制显示，上下层绘制叠盖\n\n";

    private String xml = "" +
            "<ImageView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"0dp\"\n" +
            "        android:layout_weight=\"1\"\n" +
            "        android:src=\"@drawable/pic4\"\n" +
            "        android:tint=\"@android:color/holo_blue_bright\"\n" +
            "        android:tintMode=\"add\"/>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinting);
        findViewById(R.id.tinting_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TintingActivity.this)
                        .setTitle("示例代码")
                        .setMessage(code + xml);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
