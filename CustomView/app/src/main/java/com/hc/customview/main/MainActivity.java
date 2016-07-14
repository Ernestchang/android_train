package com.hc.customview.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hc.customview.R;
import com.hc.customview.box.BoxActivity;
import com.hc.customview.score.ScoreActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_double_image).setOnClickListener(this);
        findViewById(R.id.btn_box).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_double_image:
                startActivity(new Intent(this, ScoreActivity.class));
                break;
            case R.id.btn_box:
                startActivity(new Intent(this, BoxActivity.class));
                break;
        }
    }

}
