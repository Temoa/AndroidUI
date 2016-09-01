package com.temoa.androidui;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class NavigationViewActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    private String xml = "布局代码\n<android.support.v4.widget.DrawerLayout\n" +
            "    android:id=\"@+id/drawerLayout_9\"\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\">\n" +
            "\n" +
            "    <!-- 主布局 -->\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:orientation=\"vertical\">\n" +
            "\n" +
            "        <android.support.v7.widget.Toolbar\n" +
            "            android:id=\"@+id/toolbar_9\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"?attr/actionBarSize\"\n" +
            "            android:background=\"@color/colorPrimary\"\n" +
            "            android:theme=\"@style/Theme.AppCompat\"/>\n" +
            "\n" +
            "        <include layout=\"@layout/common\"/>\n" +
            "    </LinearLayout>\n" +
            "\n" +
            "    <!-- 抽屉布局 -->\n" +
            "    <android.support.design.widget.NavigationView\n" +
            "        android:id=\"@+id/nav_9\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:layout_gravity=\"start\"\n" +
            "        android:fitsSystemWindows=\"true\"\n" +
            "        app:headerLayout=\"@layout/nav_header\"\n" +
            "        app:menu=\"@menu/nav_menu\"/>\n" +
            "</android.support.v4.widget.DrawerLayout>\n\n";

    private String code = "Java代码\ndrawerLayout.openDrawer(GravityCompat.START);\n" +
            "        navigationView.setNavigationItemSelectedListener(new Navigation.OnNavigationItemSelectedListener() {\n" +
            "            @Override\n" +
            "            public boolean onNavigationItemSelected(MenuItem item) {\n" +
            "                int id = item.getItemId();\n" +
            "                String title = (String) item.getTitle();\n" +
            "                switch (id) {\n" +
            "                    case R.id.nav_ver:\n" +
            "                        Toast.makeText(NavigationViewActivity.this, title, Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case R.id.nav_about:\n" +
            "                        Toast.makeText(NavigationViewActivity.this, title, Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case R.id.sub_exit:\n" +
            "                        Toast.makeText(NavigationViewActivity.this, title, Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case R.id.sub_switch:\n" +
            "                        Toast.makeText(NavigationViewActivity.this, title, Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                }\n" +
            "                item.setChecked(true);\n" +
            "                drawerLayout.closeDrawer(GravityCompat.START);\n" +
            "                return true;\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * 返回键控制DrawerLayout关闭\n" +
            "     */\n" +
            "    @Override\n" +
            "    public void onBackPressed() {\n" +
            "        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {\n" +
            "            drawerLayout.closeDrawer(GravityCompat.START);\n" +
            "        } else {\n" +
            "            super.onBackPressed();\n" +
            "        }\n" +
            "    }";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_9);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_9);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_9);

        drawerLayout.openDrawer(GravityCompat.START);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                String title = (String) item.getTitle();
                switch (id) {
                    case R.id.nav_ver:
                        Toast.makeText(NavigationViewActivity.this, title, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_about:
                        Toast.makeText(NavigationViewActivity.this, title, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.sub_exit:
                        Toast.makeText(NavigationViewActivity.this, title, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.sub_switch:
                        Toast.makeText(NavigationViewActivity.this, title, Toast.LENGTH_SHORT).show();
                        break;
                }
                item.setChecked(true);
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(xml + code);
    }

    /**
     * 返回键控制DrawerLayout关闭
     */
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
