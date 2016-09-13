package com.temoa.androidui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.temoa.androidui.other.ToTransitionActivity;

public class TransitionActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv;

    private String code = "Java Code\n" +
            "// 在setContentView()方法前设置.调用和被调用的Activity都要设置\n" +
            "if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {\n" +
            "            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);\n" +
            "            getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);\n" +
            "            // 这里除了Explode,还有Slide和Fade" +
            "            getWindow().setExitTransition(new Explode());\n" +
            "            getWindow().setEnterTransition(new Explode());\n" +
            "}\n" +
            "Intent intent = new Intent(this, ToTransitionActivity.class);\n" +
            "        intent.putExtra(\"type\", type);\n" +
            "        ActivityOptionsCompat options = ActivityOptionsCompat\n" +
            "                .makeSceneTransitionAnimation(this, iv, \"hello\");\n" +
            "        ActivityCompat.startActivity(this, intent, options.toBundle());\n\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
            getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        }

        setContentView(R.layout.activity_transition);

        iv = (ImageView) findViewById(R.id.image);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(code);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn1:
                // 分解
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Transition explode =
                            TransitionInflater.from(this).inflateTransition(R.transition.explode);
                    getWindow().setExitTransition(explode);
                    getWindow().setEnterTransition(explode);
//                    getWindow().setExitTransition(new Explode());
//                    getWindow().setEnterTransition(new Explode());
                }
                createIntent(1);
                break;
            case R.id.btn2:
                // 滑动
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Transition slide =
                            TransitionInflater.from(this).inflateTransition(R.transition.slide);
                    getWindow().setEnterTransition(slide);
                    getWindow().setExitTransition(slide);
//                    getWindow().setExitTransition(new Slide());
//                    getWindow().setEnterTransition(new Slide());
                }
                createIntent(2);
                break;
            case R.id.btn3:
                // 淡入淡出
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Transition fade =
                            TransitionInflater.from(this).inflateTransition(R.transition.fade);
                    getWindow().setExitTransition(fade);
                    getWindow().setEnterTransition(fade);
                }
                createIntent(3);
                break;
        }
    }

    private void createIntent(int type) {
        Intent intent = new Intent(this, ToTransitionActivity.class);
        intent.putExtra("type", type);
        ActivityOptionsCompat options = ActivityOptionsCompat
                .makeSceneTransitionAnimation(this, iv, "hello");
        ActivityCompat.startActivity(this, intent, options.toBundle());
    }
}
