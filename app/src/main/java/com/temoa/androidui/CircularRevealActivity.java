package com.temoa.androidui;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;

public class CircularRevealActivity extends AppCompatActivity {

    private String code = "Java代码\n" +
            "toolbar.post(new Runnable() {\n" +
            "            @Override\n" +
            "            public void run() {\n" +
            "                Animator animator = null;\n" +
            "                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {\n" +
            "                    animator = ViewAnimationUtils.createCircularReveal(\n" +
            "                            toolbar,\n" +
            "                            toolbar.getWidth()/2,\n" +
            "                            toolbar.getHeight()/2,\n" +
            "                            0,\n" +
            "                            (float) Math.hypot(toolbar.getWidth(), toolbar.getHeight()));\n" +
            "                    animator.setInterpolator(new AccelerateDecelerateInterpolator());\n" +
            "                    animator.setDuration(600);\n" +
            "                    animator.start();\n" +
            "                }\n" +
            "\n" +
            "            }\n" +
            "        });";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_reveal);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.post(new Runnable() {
            @Override
            public void run() {
                Animator animator = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    animator = ViewAnimationUtils.createCircularReveal(
                            toolbar,
                            toolbar.getWidth()/2,
                            toolbar.getHeight()/2,
                            0,
                            (float) Math.hypot(toolbar.getWidth(), toolbar.getHeight()));
                    animator.setInterpolator(new AccelerateDecelerateInterpolator());
                    animator.setDuration(600);
                    animator.start();
                }

            }
        });

        TextView tv  = (TextView) findViewById(R.id.text);
        tv.setText(code);
    }
}
