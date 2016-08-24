package com.temoa.androidui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.temoa.androidui.fragment.PagerFragment;

public class TabLayoutActivity extends AppCompatActivity {

    private String[] titleList = {"tab1", "tab2", "tab3", "tab4", "tab5", "tab6", "tab7", "tab8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_6);
        setSupportActionBar(toolbar);
        ViewPager pager = (ViewPager) findViewById(R.id.pager_6);
        TabLayout tab = (TabLayout) findViewById(R.id.tab_6);

        // 新建一个ViewPagerAdapter
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), titleList);

        // ViewPager设置adapter
        pager.setAdapter(adapter);

        //设置tab模式，当前为系统默认模式
        tab.setTabMode(TabLayout.MODE_FIXED);

        // tabLayout设置ViewPager
        tab.setupWithViewPager(pager);

        // 如果有tab有很多的内容,需要设置SCROLLABLE模式,来实现滑动
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);

        // 设置title字体的颜色,第一个是默认的颜色,第二个是选中的颜色
        tab.setTabTextColors(
                getResources().getColor(R.color.colorAccent),
                getResources().getColor(R.color.white));

        // 设置下划线的颜色
        tab.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorAccent));

    }

    public class PagerAdapter extends FragmentStatePagerAdapter {

        private String[] titleList;

        public PagerAdapter(FragmentManager fm, String[] titleList) {
            super(fm);
            this.titleList = titleList;
        }

        @Override
        public Fragment getItem(int position) {
            return new PagerFragment();
        }

        @Override
        public int getCount() {
            return titleList == null ? 0 : titleList.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titleList == null ? null : titleList[position];
        }
    }
}
