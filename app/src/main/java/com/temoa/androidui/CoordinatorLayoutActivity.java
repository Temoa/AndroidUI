package com.temoa.androidui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class CoordinatorLayoutActivity extends AppCompatActivity {

    private String xml = "布局代码\n<android.support.design.widget.CoordinatorLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    >\n" +
            "    <!-- 必须添加AppBarLayout包裹Toolbar才能够实现-->\n" +
            "    <android.support.design.widget.AppBarLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\">\n" +
            "        <!-- scrollFlags有三个属性可以选择-->\n" +
            "        <!-- scroll: 所有想滚动出屏幕的view都需要设置这个flag- 没有设置这个flag的view将被固定在屏幕顶部-->\n" +
            "        <!-- enterAlways: 这个flag让任意向下的滚动都会导致该view变为可见，启用快速“返回模式-->\n" +
            "        <!-- enterAlwaysCollapsed: 当你的视图已经设置minHeight属性又使用此标志时，你的视图只能已最小高度进入，只有当滚动视图到达顶部时才扩大到完整高度-->\n" +
            "        <!-- exitUntilCollapsed: 滚动退出屏幕，最后折叠在顶端-->\n" +
            "        <android.support.v7.widget.Toolbar\n" +
            "            android:id=\"@+id/toolbar_7\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"?attr/actionBarSize\"\n" +
            "            android:background=\"@color/colorPrimary\"\n" +
            "            android:theme=\"@style/Theme.AppCompat\"\n" +
            "            app:layout_scrollFlags=\"scroll|enterAlways\"/>\n" +
            "    </android.support.design.widget.AppBarLayout>\n" +
            "\n" +
            "    <!-- 为了使得Toolbar可以滑动-->\n" +
            "    <!-- 需要给CoordinatorLayout布局下包裹一个可以滑动的布局,如RecyclerView 和NestedScrollView-->\n" +
            "    <!-- 设置app:layout_behavior=\"@string/appbar_scrolling_view_behavior\",告知CoordinatorLayout该组件带有滑动行为-->\n" +
            "    <android.support.v4.widget.NestedScrollView\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:padding=\"@dimen/activity_vertical_margin\"\n" +
            "        app:layout_behavior=\"@string/appbar_scrolling_view_behavior\"\n" +
            "        >\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/tv_7\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"/>\n" +
            "    </android.support.v4.widget.NestedScrollView>\n" +
            "\n" +
            "    <android.support.design.widget.FloatingActionButton\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"end|bottom\"\n" +
            "        android:layout_margin=\"@dimen/activity_vertical_margin\"\n" +
            "        android:src=\"@mipmap/ic_launcher\"\n" +
            "        app:backgroundTint=\"@color/colorPrimary\"\n" +
            "        />\n" +
            "</android.support.design.widget.CoordinatorLayout>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_7);
        setSupportActionBar(toolbar);

        TextView tv = (TextView) findViewById(R.id.tv_7);
        tv.setText(xml);
    }
}
