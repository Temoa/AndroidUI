package com.temoa.androidui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity {

    private String code = "Java代码\nprivate void initPopupMenu(View view) {\n" +
            "        final PopupMenu popupMenu = new PopupMenu(this, view);\n" +
            "        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());\n" +
            "        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {\n" +
            "            @Override\n" +
            "            public boolean onMenuItemClick(MenuItem item) {\n" +
            "                int id = item.getItemId();\n" +
            "                switch (id) {\n" +
            "                    case R.id.pop_menu_save:\n" +
            "                        Toast.makeText(PopupMenuActivity.this, \"save\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case R.id.pop_menu_mod:\n" +
            "                        Toast.makeText(PopupMenuActivity.this, \"mod\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case R.id.pop_menu_share:\n" +
            "                        Toast.makeText(PopupMenuActivity.this, \"share\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                }\n" +
            "                popupMenu.dismiss();\n" +
            "                return true;\n" +
            "            }\n" +
            "        });\n" +
            "        popupMenu.show();\n" +
            "    }\n" +
            "\n" +
            "    private void initPopupWindow(View v) {\n" +
            "        final ListPopupWindow listPopupWindow = new ListPopupWindow(this);\n" +
            "        listPopupWindow.setAdapter(new ArrayAdapter<>(\n" +
            "                this, android.R.layout.simple_list_item_1, new String[]{\"保存\", \"修改\", \"分享\"}));\n" +
            "\n" +
            "        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
            "            @Override\n" +
            "            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {\n" +
            "                switch (i) {\n" +
            "                    case 0:\n" +
            "                        Toast.makeText(PopupMenuActivity.this, \"save\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case 1:\n" +
            "                        Toast.makeText(PopupMenuActivity.this, \"mod\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                    case 2:\n" +
            "                        Toast.makeText(PopupMenuActivity.this, \"share\", Toast.LENGTH_SHORT).show();\n" +
            "                        break;\n" +
            "                }\n" +
            "                listPopupWindow.dismiss();\n" +
            "            }\n" +
            "        });\n" +
            "        // 设置锚点的view\n" +
            "        listPopupWindow.setAnchorView(v);\n" +
            "        // 设置距离锚点的横向和纵向距离\n" +
            "        listPopupWindow.setHorizontalOffset(20);\n" +
            "        listPopupWindow.setVerticalOffset(20);\n" +
            "        listPopupWindow.setHeight(300);\n" +
            "        listPopupWindow.setWidth(150);\n" +
            "        // 设置是否响应所有的点击和按键动作\n" +
            "        listPopupWindow.setModal(true);\n" +
            "        listPopupWindow.show();\n" +
            "    }";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
        findViewById(R.id.start_popupMenu_13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initPopupMenu(view);
            }
        });

        findViewById(R.id.start_popupWindow_13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initPopupWindow(view);
            }
        });

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(code);
    }

    private void initPopupMenu(View view) {
        final PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.pop_menu_save:
                        Toast.makeText(PopupMenuActivity.this, "save", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.pop_menu_mod:
                        Toast.makeText(PopupMenuActivity.this, "mod", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.pop_menu_share:
                        Toast.makeText(PopupMenuActivity.this, "share", Toast.LENGTH_SHORT).show();
                        break;
                }
                popupMenu.dismiss();
                return true;
            }
        });
        popupMenu.show();
    }

    private void initPopupWindow(View v) {
        final ListPopupWindow listPopupWindow = new ListPopupWindow(this);
        listPopupWindow.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, new String[]{"保存", "修改", "分享"}));

        listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Toast.makeText(PopupMenuActivity.this, "save", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(PopupMenuActivity.this, "mod", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(PopupMenuActivity.this, "share", Toast.LENGTH_SHORT).show();
                        break;
                }
                listPopupWindow.dismiss();
            }
        });
        // 设置锚点的view
        listPopupWindow.setAnchorView(v);
        // 设置距离锚点的横向和纵向距离
        listPopupWindow.setHorizontalOffset(20);
        listPopupWindow.setVerticalOffset(20);
        listPopupWindow.setHeight(300);
        listPopupWindow.setWidth(150);
        // 设置是否响应所有的点击和按键动作
        listPopupWindow.setModal(true);
        listPopupWindow.show();
    }
}
