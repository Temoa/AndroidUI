package com.temoa.androidui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MaterialDialogActivity extends AppCompatActivity {

    private String code = "Java代码\nAlertDialog.Builder builder = new AlertDialog.Builder(this);\n" +
            "        builder\n" +
            "                .setTitle(\"Material Design Dialog\")\n" +
            "                // 设置Dialog左边的按钮,例如\"更多\"按钮\n" +
            "                .setNeutralButton(\"more\", null)\n" +
            "                .setMessage(\"让我们一起飞，我带着你，你带着钱，来一场说走就走的旅行\")\n" +
            "                .setNegativeButton(\"Canal\", new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialogInterface, int i) {\n" +
            "                        Toast.makeText(MaterialDialogActivity.this, \"click canal\", Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                })\n" +
            "                .setPositiveButton(\"Ok\", new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialogInterface, int i) {\n" +
            "                        Toast.makeText(MaterialDialogActivity.this, \"click ok\", Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                })\n" +
            "                .show();";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_dialog);
        showDialog();
        findViewById(R.id.create_Dialog_10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        TextView tv = (TextView) findViewById(R.id.tv_10);
        tv.setText(code);
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setTitle("Material Design Dialog")
                // 设置Dialog左边的按钮,例如"更多"按钮
                .setNeutralButton("more", null)
                .setMessage("让我们一起飞，我带着你，你带着钱，来一场说走就走的旅行")
                .setNegativeButton("Canal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MaterialDialogActivity.this, "click canal", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MaterialDialogActivity.this, "click ok", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}
