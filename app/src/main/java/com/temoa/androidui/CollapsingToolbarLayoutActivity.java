package com.temoa.androidui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class CollapsingToolbarLayoutActivity extends AppCompatActivity {

    private String xml = "布局代码" +
            "<!--\n" +
            "    仍然需要CoordinatorLayout来作为父控件\n" +
            "    需要响应滑动的子控件需要设置\n" +
            "    app:layout_scrollFlags=\"exitUntilCollapsed|scroll\"\n" +
            "    可滑动的控件需要设置\n" +
            "    app:layout_behavior=\"@string/appbar_scrolling_view_behavior\"\n" +
            "-->\n" +
            "<android.support.design.widget.CoordinatorLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:fitsSystemWindows=\"true\"\n" +
            "    >\n" +
            "\n" +
            "    <android.support.design.widget.AppBarLayout\n" +
            "        android:id=\"@+id/appBarLayout_8\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"200dp\"\n" +
            "        android:fitsSystemWindows=\"true\">\n" +
            "        <!--\n" +
            "        (1)CollapsingToolbarLayout包裹Toolbar时提供一个可折叠的Toolbar\n" +
            "           一般作为AppBarLayout的子控件\n" +
            "        (2)下列一些常用的属性:\n" +
            "           app:title 设置标题 setTitle(CharSequence)\n" +
            "             如果app:titleEnabled设置为true时,title字体会从开始的较大字体开始随着折叠缩小\n" +
            "             如果app:titleEnabled设置为false是,title为默认的标题,并且固定在最终停留的位置\n" +
            "           app:contentScrim 设置折叠到顶部时的背景 setContentScrim(Drawable)\n" +
            "           app:layout_collapseParallaxMultiplier 设置子控件的视图差\n" +
            "           app:layout_collapseMod 设置子控件的折叠模式\n" +
            "             有两种:\"pin\"是固定在顶端;\"parallax\"是视察模式,展示折叠的效果\n" +
            "        -->\n" +
            "        <android.support.design.widget.CollapsingToolbarLayout\n" +
            "            android:id=\"@+id/collapsingToolbar_8\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"\n" +
            "            android:fitsSystemWindows=\"true\"\n" +
            "            android:theme=\"@style/Theme.AppCompat\"\n" +
            "            app:contentScrim=\"@color/colorPrimary\"\n" +
            "            app:expandedTitleMarginEnd=\"64dp\"\n" +
            "            app:expandedTitleMarginStart=\"48dp\"\n" +
            "            app:layout_scrollFlags=\"exitUntilCollapsed|scroll\"\n" +
            "            app:statusBarScrim=\"@color/colorAccent\"\n" +
            "            app:title=\"我爱舰娘\"\n" +
            "            >\n" +
            "\n" +
            "            <ImageView\n" +
            "                android:id=\"@+id/image\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"match_parent\"\n" +
            "                android:fitsSystemWindows=\"true\"\n" +
            "                android:scaleType=\"centerCrop\"\n" +
            "                android:src=\"@drawable/pic\"\n" +
            "                app:layout_collapseMode=\"parallax\"\n" +
            "                app:layout_collapseParallaxMultiplier=\"0.8\"/>\n" +
            "\n" +
            "            <android.support.v7.widget.Toolbar\n" +
            "                android:id=\"@+id/toolbar_8\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"?attr/actionBarSize\"\n" +
            "                android:theme=\"@style/Theme.AppCompat\"\n" +
            "                app:layout_collapseMode=\"pin\"\n" +
            "                />\n" +
            "        </android.support.design.widget.CollapsingToolbarLayout>\n" +
            "    </android.support.design.widget.AppBarLayout>\n" +
            "\n" +
            "    <android.support.v4.widget.NestedScrollView\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:padding=\"@dimen/activity_vertical_margin\"\n" +
            "        android:clipToPadding=\"false\"\n" +
            "        app:layout_behavior=\"@string/appbar_scrolling_view_behavior\">\n" +
            "\n" +
            "        <android.support.v7.widget.CardView\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            app:cardElevation=\"4dp\"\n" +
            "            app:contentPadding=\"8dp\">\n" +
            "\n" +
            "            <TextView\n" +
            "                android:id=\"@+id/tv_8\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"match_parent\"/>\n" +
            "        </android.support.v7.widget.CardView>\n" +
            "    </android.support.v4.widget.NestedScrollView>\n" +
            "\n" +
            "\n" +
            "    <!--\n" +
            "        FloatingActionButton可以依附在AppBarLayout上\n" +
            "        需要设置app:layout_anchor=\"@id/appBarLayout_8\"\n" +
            "        控制依附的位置:app:layout_anchorGravity=\"end|bottom\"\n" +
            "    -->\n" +
            "    <android.support.design.widget.FloatingActionButton\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_margin=\"16dp\"\n" +
            "        android:clickable=\"true\"\n" +
            "        android:src=\"@mipmap/ic_launcher\"\n" +
            "        app:backgroundTint=\"@color/colorPrimary\"\n" +
            "        app:layout_anchor=\"@id/appBarLayout_8\"\n" +
            "        app:layout_anchorGravity=\"end|bottom|right\"\n" +
            "        app:rippleColor=\"#ffffff\"\n" +
            "        />\n" +
            "\n" +
            "</android.support.design.widget.CoordinatorLayout>\n\n";

    private String code = "更新:Java code:\n" +
            "final CollapsingToolbarLayout collapsingToolbarLayout\n" +
            "                = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar_8);\n" +
            "// title的渐变颜色\n" +
            "collapsingToolbarLayout\n" +
            "        .setExpandedTitleColor(getResources().getColor(android.R.color.transparent));\n" +
            "\n" +
            "ImageView iv = (ImageView) findViewById(R.id.image);\n" +
            "Bitmap bitmap = ((BitmapDrawable) iv.getDrawable()).getBitmap();\n" +
            "// 从图片中提取颜色\n" +
            "Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {\n" +
            "    @Override\n" +
            "    public void onGenerated(Palette palette) {\n" +
            "        collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(getResources().getColor(R.color.colorPrimary)));\n" +
            "        collapsingToolbarLayout.setStatusBarScrimColor(palette.getDarkMutedColor(getResources().getColor(R.color.colorPrimaryDark)));\n" +
            "    }\n" +
            "});\n\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_8);
        setSupportActionBar(toolbar);

        final CollapsingToolbarLayout collapsingToolbarLayout
                = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar_8);
        // title的渐变颜色
        collapsingToolbarLayout
                .setExpandedTitleColor(getResources().getColor(android.R.color.transparent));

        ImageView iv = (ImageView) findViewById(R.id.image);
        Bitmap bitmap = ((BitmapDrawable) iv.getDrawable()).getBitmap();
        // 从图片中提取颜色
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(getResources().getColor(R.color.colorPrimary)));
                collapsingToolbarLayout.setStatusBarScrimColor(palette.getDarkMutedColor(getResources().getColor(R.color.colorPrimaryDark)));
            }
        });

        TextView tv = (TextView) findViewById(R.id.tv_8);
        tv.setText(code + xml);
    }
}
