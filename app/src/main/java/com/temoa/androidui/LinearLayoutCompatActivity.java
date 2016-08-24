package com.temoa.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LinearLayoutCompatActivity extends AppCompatActivity {

    private String xml = "布局代码\n<LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:paddingTop=\"16dp\">\n" +
            "\n" +
            "    <!--\n" +
            "        用于给LinerLayout中的子元素item之间设置间隔线\n" +
            "        app:divider=”@drawable/line 设置分割线的颜色,需要定义shape资源\n" +
            "            solid android:color=\"@color/material_blue_grey_800\"\n" +
            "            size android:height=\"1px\"\n" +
            "        app:dividerPadding=”25dp” 设置分隔线设置距离左右边距的距离\n" +
            "        app:showDividers=”middle|beginning|end” 设置分割线的位置\n" +
            "            middle 在每一个子布局之间\n" +
            "            beginning 在最上边显示,即第一个子布局的上方\n" +
            "            end 在最底部显示,即最后一个子布局的上方\n" +
            "            none 不显示分割线\n" +
            "    -->\n" +
            "    <android.support.v7.widget.LinearLayoutCompat\n" +
            "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:orientation=\"vertical\"\n" +
            "        app:divider=\"@drawable/line\"\n" +
            "        app:dividerPadding=\"24dp\"\n" +
            "        app:showDividers=\"beginning\">\n" +
            "\n" +
            "        <TextView\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:gravity=\"center\"\n" +
            "            android:text=\"@string/app_name\"/>\n" +
            "\n" +
            "        <ImageView\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"160dp\"\n" +
            "            android:layout_margin=\"@dimen/activity_vertical_margin\"\n" +
            "            android:scaleType=\"centerCrop\"\n" +
            "            android:src=\"@drawable/pic\"/>\n" +
            "    </android.support.v7.widget.LinearLayoutCompat>\n" +
            "\n" +
            "    <android.support.v7.widget.LinearLayoutCompat\n" +
            "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:orientation=\"vertical\"\n" +
            "        app:divider=\"@drawable/line\"\n" +
            "        app:dividerPadding=\"24dp\"\n" +
            "        app:showDividers=\"beginning|end\">\n" +
            "\n" +
            "        <TextView\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:gravity=\"center\"\n" +
            "            android:text=\"@string/app_name\"/>\n" +
            "    </android.support.v7.widget.LinearLayoutCompat>\n" +
            "</LinearLayout>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_compat);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(xml);
    }
}
