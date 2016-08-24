package com.temoa.androidui;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TextInputLayoutActivity extends AppCompatActivity {

    private TextInputLayout inputLayout;
    private EditText et;

    private String add = "更新:添加密码是否可见,在xml中设置passwordToggleEnable属性\n\n";
    private String xml = "布局代码\n<LinearLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:paddingBottom=\"@dimen/activity_vertical_margin\"\n" +
            "    android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
            "    android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
            "    android:paddingTop=\"@dimen/activity_vertical_margin\">\n" +
            "\n" +
            "    <android.support.design.widget.TextInputLayout\n" +
            "        android:id=\"@+id/input_layout\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/et_1\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:inputType=\"text\"/>\n" +
            "    </android.support.design.widget.TextInputLayout>\n" +
            "\n" +
            "</LinearLayout>\n\n";

    private String code = "Java代码\ninputLayout = (TextInputLayout) findViewById(R.id.input_layout);\n" +
            "        // TextInputLayout有以下常用的方法\n" +
            "        // setHint()：设置提示语\n" +
            "        // getEditText()：得到TextInputLayout中的EditView控件\n" +
            "        // setErrorEnabled():设置是否可以显示错误信息\n" +
            "        // setError()：设置当用户输入错误时弹出的错误信息\n" +
            "        et = inputLayout.getEditText();\n" +
            "        inputLayout.setHint(\"请输入姓名\");\n" +
            "        et.addTextChangedListener(new TextWatcher() {\n" +
            "            @Override\n" +
            "            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {\n" +
            "\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {\n" +
            "                if (charSequence.length() > 4) {\n" +
            "                    inputLayout.setErrorEnabled(true);\n" +
            "                    inputLayout.setError(\"姓名长度不能超过4\");\n" +
            "                } else {\n" +
            "                    inputLayout.setErrorEnabled(false);\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void afterTextChanged(Editable editable) {\n" +
            "\n" +
            "            }\n" +
            "        });";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(add + xml + code);

        // et = (EditText) findViewById(R.id.et_1);
        inputLayout = (TextInputLayout) findViewById(R.id.input_layout);
        // TextInputLayout有以下常用的方法
        // setHint()：设置提示语
        // getEditText()：得到TextInputLayout中的EditView控件
        // setErrorEnabled():设置是否可以显示错误信息
        // setError()：设置当用户输入错误时弹出的错误信息
        et = inputLayout.getEditText();
        inputLayout.setHint("请输入姓名");
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 4) {
                    inputLayout.setErrorEnabled(true);
                    inputLayout.setError("姓名长度不能超过4");
                } else {
                    inputLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et.setText("我是你爹爹");
    }
}
