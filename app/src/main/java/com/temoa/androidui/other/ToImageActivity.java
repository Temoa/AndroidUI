package com.temoa.androidui.other;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.temoa.androidui.R;

public class ToImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_image);

        ImageView iv = (ImageView) findViewById(R.id.image_iv);
        Intent intent = getIntent();
        int id  = intent.getIntExtra("img", R.mipmap.ic_launcher);
        iv.setImageResource(id);
    }
}
