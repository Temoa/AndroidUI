package com.temoa.androidui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FloatingActionButtonActivity extends AppCompatActivity {

    private String xml = "布局代码\n<FrameLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    >\n" +
            "\n" +
            "    <!--\n" +
            "        app:fabSize 设置btn的大小,有min和normal两个值,还有个auto应该是根据屏幕大小\n" +
            "        app:background 设置btn的背景颜色,android:background无效,FloatActionButton继承ImageButton\n" +
            "        app:elevation 设置btn的阴影深度\n" +
            "        app:rippleColor 设置按下状态的波纹\n" +
            "        app:pressedTranslationZ 设置按下时阴影的深度\n" +
            "    -->\n" +
            "\n" +
            "    <android.support.design.widget.FloatingActionButton\n" +
            "        android:id=\"@+id/floatActionBtn_1\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"end|bottom\"\n" +
            "        android:layout_margin=\"16dp\"\n" +
            "        android:clickable=\"true\"\n" +
            "        android:src=\"@mipmap/ic_launcher\"\n" +
            "        app:fabSize=\"normal\"\n" +
            "        app:rippleColor=\"#ffffff\"\n" +
            "        />\n" +
            "\n" +
            "    <android.support.design.widget.FloatingActionButton\n" +
            "        android:id=\"@+id/floatActionBtn_2\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center_horizontal|bottom\"\n" +
            "        android:layout_margin=\"16dp\"\n" +
            "        android:src=\"@mipmap/ic_launcher\"\n" +
            "        app:backgroundTint=\"@color/colorPrimary\"\n" +
            "        app:fabSize=\"mini\"\n" +
            "        />\n" +
            "\n" +
            "    <android.support.design.widget.FloatingActionButton\n" +
            "        android:id=\"@+id/floatActionBtn_3\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"start|bottom\"\n" +
            "        android:layout_margin=\"16dp\"\n" +
            "        android:clickable=\"true\"\n" +
            "        android:src=\"@mipmap/ic_launcher\"\n" +
            "        app:elevation=\"15dp\"\n" +
            "        app:fabSize=\"normal\"\n" +
            "        app:pressedTranslationZ=\"2dp\"\n" +
            "        app:rippleColor=\"#ffffff\"\n" +
            "        />\n" +
            "</FrameLayout>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(xml);
    }
}
