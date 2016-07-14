package com.hc.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hc.animation.frame.FrameAnimationActivity;
import com.hc.animation.layout.LayoutAnimationActivity;
import com.hc.animation.tween.TweenAnimationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_tween).setOnClickListener(this);
        findViewById(R.id.btn_frame).setOnClickListener(this);
        findViewById(R.id.btn_layout).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_tween:
                start(TweenAnimationActivity.class);
                break;
            case R.id.btn_frame:
                start(FrameAnimationActivity.class);
                break;
            case R.id.btn_layout:
                start(LayoutAnimationActivity.class);
                break;
        }
    }

    private void start(Class clz) {
        startActivity(new Intent(this, clz));
        // 第一个参数是跳转的目的activity进入的动画，每二个参数是当前activity的退出动画
        overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
    }

}
