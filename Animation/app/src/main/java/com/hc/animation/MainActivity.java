package com.hc.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hc.animation.frame.FrameAnimationActivity;
import com.hc.animation.tween.TweenAnimationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_tween).setOnClickListener(this);
        findViewById(R.id.btn_frame).setOnClickListener(this);
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
        }
    }

    private void start(Class clz) {
        startActivity(new Intent(this, clz));
    }

}
