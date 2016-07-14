package com.hc.animation.tween;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hc.animation.R;

/**
 * Created by liulei0905 on 2016/7/14.
 *
 */
public class TweenAnimationActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mImage;
    private TextView mTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        findViewById(R.id.btn_translate).setOnClickListener(this);
        findViewById(R.id.btn_scale).setOnClickListener(this);
        findViewById(R.id.btn_rotate).setOnClickListener(this);
        findViewById(R.id.btn_alpha).setOnClickListener(this);
        findViewById(R.id.btn_set).setOnClickListener(this);
        findViewById(R.id.btn_translate_xml).setOnClickListener(this);
        findViewById(R.id.btn_scale_xml).setOnClickListener(this);
        findViewById(R.id.btn_rotate_xml).setOnClickListener(this);
        findViewById(R.id.btn_alpha_xml).setOnClickListener(this);
        findViewById(R.id.btn_set_xml).setOnClickListener(this);
        mImage = (ImageView) findViewById(R.id.img);
        mTv = (TextView) findViewById(R.id.tv);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_translate:
                translateAnimation();
                break;
            case R.id.btn_scale:
                scaleAnimation();
                break;
            case R.id.btn_rotate:
                rotateAnimation();
                break;
            case R.id.btn_alpha:
                alphaAnimation();
                break;
            case R.id.btn_set:
                setAnimation();
                break;
            case R.id.btn_translate_xml:
                xmlAnimation(R.anim.translate);
                break;
            case R.id.btn_scale_xml:
                xmlAnimation(R.anim.scale);
                break;
            case R.id.btn_rotate_xml:
                xmlAnimation(R.anim.rotate);
                break;
            case R.id.btn_alpha_xml:
                xmlAnimation(R.anim.alpha);
                break;
            case R.id.btn_set_xml:
                xmlAnimation(R.anim.set);
                break;
        }
    }

    /**
     * 平移动画
     * */
    private void translateAnimation() {
        /*
        * Animation.RELATIVE_TO_SELF，设置动画控件的左上角为坐标原点，
        * 动画旋转轴的坐标为(view.getWidth*pivotXValue, view.getHeight*pivotYValue)
        * 负数向左(X轴)/上(Y轴)偏移，正数向右(X轴)/下(Y轴)偏移
        * */
        TranslateAnimation translateAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 1.0f);
        translateAnimation.setDuration(1000);

        mImage.startAnimation(translateAnimation);
    }

    /**
     * 缩放动画
     * */
    private void scaleAnimation() {
        /*
        * 参数1/2： x轴缩放前后的缩放比
        * 参数3/4： y轴缩放前后的缩放比
        * 参数5/6： 确定缩放时x轴原点位置
        * 参数7/8： 确定缩放时y轴原点位置
        * 参数5/6/7/8： 确定缩放时基准点位置
        * */
        ScaleAnimation scaleAnimation = new ScaleAnimation(
                1.0f, 1.2f,
                1.0f, 1.2f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(1000);

        mImage.startAnimation(scaleAnimation);
    }

    /**
     * 旋转动画
     * */
    private void rotateAnimation() {
        /*
        * 参数1： 起始角度
        * 参数2： 终止角度
        * 参数3/4/5/6： 确定旋转中心
        * */
        RotateAnimation rotateAnimation = new RotateAnimation(
                0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1000);

        mImage.startAnimation(rotateAnimation);
    }

    /**
     * 透明度动画
     * */
    private void alphaAnimation() {
        /*
        * 参数1： 起始透明度
        * 参数2： 终止透明度
        * */
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                mTv.setText("onAnimationStart");
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mTv.setText("onAnimationEnd");
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                mTv.setText("onAnimationRepeat");
            }
        });

        mImage.startAnimation(alphaAnimation);
    }

    /**
     * 组合动画，同时包含以上四种基本动画中的一种或多种
     * */
    private void setAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        alphaAnimation.setDuration(1000);

        RotateAnimation rotateAnimation = new RotateAnimation(
                0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1000);

        ScaleAnimation scaleAnimation = new ScaleAnimation(
                1.0f, 1.2f,
                1.0f, 1.2f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(1000);

        TranslateAnimation translateAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 1.0f);
        translateAnimation.setDuration(1000);

        // 传入参数true，则AnimationSet中所有Animation共用一个interpolator
        AnimationSet animationSet = new AnimationSet(true);
        // 基本动画的添加顺序会对最后的显示效果有影响
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(translateAnimation);

        mImage.startAnimation(animationSet);
    }

    /**
     * xml实现的tween动画
     * */
    private void xmlAnimation(int animId) {
        Animation animation = AnimationUtils.loadAnimation(this, animId);
        mImage.startAnimation(animation);
    }

}
