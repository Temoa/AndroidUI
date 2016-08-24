package com.temoa.androidui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.temoa.androidui.other.ToImageActivity;

public class FromImageActivity extends AppCompatActivity {

    private String xml =
            "布局代码:\n在FromImageView中添加transitionName的属性," +
                    "在ToImageView中添加transitionName," +
                    "layout_collapseMode=\"parallax\"," +
                    "和layout_collapseParallaxMultiplier=\"0.7\"," +
                    "transitionName属只是普通的String,但是必须相同\n\n";

    private String code =
            "Java代码:\n" +
                    "Intent intent = new Intent(FromImageActivity.this, ToImageActivity.class);\n" +
                    "intent.putExtra(\"img\", R.drawable.pic);\n" +
                    "// 使用ActivityOptionsCompat的makeSceneTransitionAnimation方法创建动画\n" +
                    "// 需要指定一个view为起始变换的view,以及变换的transitionName\n" +
                    "ActivityOptionsCompat options = ActivityOptionsCompat\n" +
                    "              .makeSceneTransitionAnimation(\n" +
                    "                  FromImageActivity.this,\n" +
                    "                  iv,\n" +
                    "                  getString(R.string.transition_img));\n" +
                    "ActivityCompat.startActivity(FromImageActivity.this, intent, options.toBundle());";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_image);

        TextView tv = (TextView) findViewById(R.id.tv);
        final ImageView iv = (ImageView) findViewById(R.id.from_image_iv);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FromImageActivity.this, ToImageActivity.class);
                intent.putExtra("img", R.drawable.pic);
                // 使用ActivityOptionsCompat的makeSceneTransitionAnimation方法创建动画
                // 需要指定一个view为起始变换的view,以及变换的transitionName
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(
                                FromImageActivity.this,
                                iv,
                                getString(R.string.transition_img));
                ActivityCompat.startActivity(FromImageActivity.this, intent, options.toBundle());
            }
        });
        tv.setText(xml + code);
    }
}
