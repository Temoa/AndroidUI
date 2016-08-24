package com.temoa.androidui;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SnackbarActivity extends AppCompatActivity {

    private String code = "Java代码\n// 第三个参数有三个选项\n" +
            "// LENGTH_INDEFINITE 无限期的\n" +
            "// LENGTH_SHORT\n" +
            "// LENGTH_LONG\n" +
            "final Snackbar snackbar = Snackbar.make(btn, \"测试\", Snackbar.LENGTH_INDEFINITE);\n" +
            "// 修改Snakbar的背景颜色\n" +
            "snackbar.getView().setBackgroundColor(getResources().getColor(R.color.colorPrimary));\n" +
            "// setAction设置点击事件\n" +
            "// 可以使用setActionTextColor 设置按钮字体的颜色\n" +
            "snackbar.setAction(\"取消\", new View.OnClickListener() {\n" +
            "    @Override\n" +
            "    public void onClick(View view) {\n" +
            "        snackbar.dismiss();\n" +
            "    }\n" +
            "});\n" +
            "snackbar.show();";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        final Button btn = (Button) findViewById(R.id.btn_start_snackbar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 第三个参数有三个选项
                // LENGTH_INDEFINITE 无限期的
                // LENGTH_SHORT
                // LENGTH_LONG
                final Snackbar snackbar = Snackbar.make(btn, "测试", Snackbar.LENGTH_SHORT);
                // 修改Snakbar的背景颜色
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                // setAction设置点击事件
                // 可以使用setActionTextColor 设置按钮字体的颜色
                snackbar.setAction("取消", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackbar.dismiss();
                    }
                });
                snackbar.show();
            }
        });

        TextView tv = (TextView) findViewById(R.id.tv_5);
        tv.setText(code);
    }
}
