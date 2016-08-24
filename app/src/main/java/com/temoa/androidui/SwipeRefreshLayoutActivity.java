package com.temoa.androidui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SwipeRefreshLayoutActivity extends AppCompatActivity {

    private String xml = "布局代码\n<android.support.v4.widget.SwipeRefreshLayout\n" +
            "    android:id=\"@+id/swipe_refresh_layout_11\"\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\">\n" +
            "\n" +
            "    <include layout=\"@layout/common\"/>\n" +
            "\n" +
            "</android.support.v4.widget.SwipeRefreshLayout>\n\n";

    private String code = "Java代码\n// 设置进度条的颜色,可以是多个颜色\n" +
            "        refreshLayout.setColorSchemeColors(Color.RED, Color.GREEN, Color.BLUE);\n" +
            "        // 设置进度条大小,有Lager和Default\n" +
            "        refreshLayout.setSize(SwipeRefreshLayout.DEFAULT);\n" +
            "        // 设置下拉多少距离之后开始更新\n" +
            "        //refreshLayout.setDistanceToTriggerSync(50);\n" +
            "        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {\n" +
            "            @Override\n" +
            "            public void onRefresh() {\n" +
            "                refreshLayout.setRefreshing(true);\n" +
            "                refreshLayout.postDelayed(new Runnable() {\n" +
            "                    @Override\n" +
            "                    public void run() {\n" +
            "                        refreshLayout.setRefreshing(false);\n" +
            "                    }\n" +
            "                }, 3000);\n" +
            "            }\n" +
            "        });";

    private String tips = "\n\n\n下滑屏幕刷新";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh_layout);

        final SwipeRefreshLayout refreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout_11);
        // 设置进度条的颜色,可以是多个颜色
        refreshLayout.setColorSchemeColors(Color.RED, Color.GREEN, Color.BLUE);
        // 设置进度条大小,有Lager和Default
        refreshLayout.setSize(SwipeRefreshLayout.DEFAULT);
        // 设置下拉多少距离之后开始更新
        //refreshLayout.setDistanceToTriggerSync(50);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout.setRefreshing(true);
                refreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshLayout.setRefreshing(false);
                    }
                }, 3000);
            }
        });

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(xml + code + tips);
    }
}
