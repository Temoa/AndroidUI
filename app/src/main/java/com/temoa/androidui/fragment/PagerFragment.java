package com.temoa.androidui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Temoa
 * on 2016/8/9 23:31
 */
public class PagerFragment extends Fragment {

    String xml = "布局代码\n<LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "\n" +
            "    <android.support.v7.widget.Toolbar\n" +
            "        android:id=\"@+id/toolbar_6\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"?attr/actionBarSize\"\n" +
            "        android:background=\"@color/colorPrimary\"\n" +
            "        android:theme=\"@style/Theme.AppCompat\"/>\n" +
            "\n" +
            "    <android.support.design.widget.TabLayout\n" +
            "        android:id=\"@+id/tab_6\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"48dp\"\n" +
            "        android:background=\"@color/colorPrimary\"\n" +
            "        app:tabIndicatorColor=\"@color/colorAccent\"\n" +
            "        app:tabSelectedTextColor=\"#ffffff\"\n" +
            "        app:tabTextColor=\"@color/colorAccent\"\n" +
            "        />\n" +
            "    <!-- TabLayout几个常用的属性-->\n" +
            "    <!--app:tabIndicatorColor 设置下滑线的颜色-->\n" +
            "    <!--app:tabSelectedTextColor 设置被选中tab的title的颜色-->\n" +
            "    <!--app:tabTextColor 设置title的默认颜色-->\n" +
            "\n" +
            "    <android.support.v4.view.ViewPager\n" +
            "        android:id=\"@+id/pager_6\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"/>\n" +
            "\n" +
            "</LinearLayout>\n\n";

    private String code = "Java代码\nViewPager pager = (ViewPager) findViewById(R.id.pager_6);\n" +
            "        TabLayout tab = (TabLayout) findViewById(R.id.tab_6);\n" +
            "\n" +
            "        // 新建一个ViewPagerAdapter\n" +
            "        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), titleList);\n" +
            "\n" +
            "        // ViewPager设置adapter\n" +
            "        pager.setAdapter(adapter);\n" +
            "\n" +
            "        //设置tab模式，当前为系统默认模式\n" +
            "        tab.setTabMode(TabLayout.MODE_FIXED);\n" +
            "\n" +
            "        // tabLayout设置ViewPager\n" +
            "        tab.setupWithViewPager(pager);\n" +
            "\n" +
            "        // 如果有tab有很多的内容,需要设置SCROLLABLE模式,来实现滑动\n" +
            "        tab.setTabMode(TabLayout.MODE_SCROLLABLE);\n" +
            "\n" +
            "        // 设置title字体的颜色,第一个是默认的颜色,第二个是选中的颜色\n" +
            "        tab.setTabTextColors(\n" +
            "                getResources().getColor(R.color.colorAccent),\n" +
            "                getResources().getColor(R.color.white));\n" +
            "\n" +
            "        // 设置下划线的颜色\n" +
            "        tab.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorAccent));";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        assert container != null;
        NestedScrollView rootView = new NestedScrollView(container.getContext());
        TextView textView = new TextView(container.getContext());
        textView.setPadding(16, 16, 16, 16);
        rootView.addView(textView);
        textView.setText(xml + code);

        return rootView;
    }
}
