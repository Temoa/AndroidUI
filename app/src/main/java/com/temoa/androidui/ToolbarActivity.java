package com.temoa.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ToolbarActivity extends AppCompatActivity {

    private String xml = "布局代码\n<LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "\n" +
            "    <android.support.v7.widget.Toolbar\n" +
            "        android:id=\"@+id/toolbar\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"?attr/actionBarSize\"\n" +
            "        android:background=\"@color/colorPrimary\"\n" +
            "        android:theme=\"@style/Theme.AppCompat\"\n" +
            "        />\n" +
            "</LinearLayout>\n\n";
    private String code = "Java代码\nToolbar toolbar = (Toolbar) findViewById(R.id.toolbar);\n" +
            "        setSupportActionBar(toolbar);\n" +
            "        // 设置NavigationIcon能够点击返回\n" +
            "        getSupportActionBar().setDisplayHomeAsUpEnabled(true);\n" +
            "        // 要自定义主标题,则需要这一句话,隐藏默认的标题\n" +
            "        getSupportActionBar().setDisplayShowTitleEnabled(false);\n" +
            "        toolbar.setTitle(\"主标题\");\n" +
            "        toolbar.setSubtitle(\"副标题\");\n" +
            "        toolbar.setLogo(R.mipmap.ic_launcher);\n" +
            "        toolbar.setNavigationIcon(android.R.drawable.ic_menu_camera);\n";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // 设置NavigationIcon能够点击返回
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // 要自定义主标题,则需要这一句话,隐藏默认的标题
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("主标题");
        toolbar.setSubtitle("副标题");
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_camera);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(xml + code);
    }

    // 添加Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_open:
                Toast.makeText(ToolbarActivity.this, "open", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_close:
                Toast.makeText(ToolbarActivity.this, "close", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
