package com.hc.animation.frame;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.hc.animation.R;

public class FrameAnimationActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        findViewById(R.id.btn_frame).setOnClickListener(this);
        mImage = (ImageView) findViewById(R.id.img);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_frame:
                frameAnimation();
                break;
        }
    }

    /**
     * 逐帧动画
     * */
    private void frameAnimation() {
        mImage.setImageResource(R.drawable.anim_frame);
        AnimationDrawable animationDrawable = (AnimationDrawable) mImage.getDrawable();
        animationDrawable.start();
    }

}
