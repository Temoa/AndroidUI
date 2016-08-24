package com.temoa.androidui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class CustomToolbarActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView title;

    private String xml = "布局代码\n<LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "\n" +
            "    <android.support.v7.widget.Toolbar\n" +
            "        android:id=\"@+id/toolbar2\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"?attr/actionBarSize\"\n" +
            "        android:background=\"@color/colorPrimary\"\n" +
            "        android:theme=\"@style/Theme.AppCompat\"\n" +
            "        >\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/toolbar_title_mid\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"@string/app_name\"\n" +
            "            android:textSize=\"24sp\"\n" +
            "            android:textStyle=\"bold\"\n" +
            "            />\n" +
            "\n" +
            "    </android.support.v7.widget.Toolbar>\n" +
            "\n" +
            "</LinearLayout>\n\n";

    private String code = "Java代码\ntitle = (TextView) findViewById(R.id.toolbar_title_mid);\n" +
            "        toolbar = (Toolbar) findViewById(R.id.toolbar2);\n" +
            "        setSupportActionBar(toolbar);\n" +
            "        // 不显示默认的标题\n" +
            "        getSupportActionBar().setDisplayShowTitleEnabled(false);\n" +
            "        // 等onCreate方法执行完了,我们定义的控件才会被度量(measure)\n" +
            "        // 所以我们在onCreate方法里面通过view.getHeight()获取控件的高度或者宽度肯定是0\n" +
            "        // 因为它自己还没有被度量,也就是说他自己都不知道自己有多高,而你这时候去获取它的尺寸,肯定是不行的.\n" +
            "        // 这里多调用了一次Measure,会影响性能\n" +
            "        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);\n" +
            "        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);\n" +
            "        title.measure(w, h);\n" +
            "        toolbar.measure(w, h);\n" +
            "\n" +
            "        int title_width = title.getMeasuredWidth();\n" +
            "        int bar_width = toolbar.getMeasuredWidth();\n" +
            "        int padding = bar_width / 2 + title_width / 2;\n" +
            "        title.setPadding(padding, 0, 0, 0);";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);
        title = (TextView) findViewById(R.id.toolbar_title_mid);
        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        // 不显示默认的标题
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        // 等onCreate方法执行完了,我们定义的控件才会被度量(measure)
        // 所以我们在onCreate方法里面通过view.getHeight()获取控件的高度或者宽度肯定是0
        // 因为它自己还没有被度量,也就是说他自己都不知道自己有多高,而你这时候去获取它的尺寸,肯定是不行的.
        // 这里多调用了一次Measure,会影响性能
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        title.measure(w, h);
        toolbar.measure(w, h);

        int title_width = title.getMeasuredWidth();
        int bar_width = toolbar.getMeasuredWidth();
        int padding = bar_width / 2 + title_width / 2;
        title.setPadding(padding, 0, 0, 0);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(xml + code);
    }
}
