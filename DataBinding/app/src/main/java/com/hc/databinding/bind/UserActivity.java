package com.hc.databinding.bind;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hc.databinding.R;
import com.hc.databinding.databinding.ActivityDataBindBinding;

/**
 * Created by liulei0905 on 2016/6/17.
 */

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBindBinding binder = DataBindingUtil.setContentView(this, R.layout.activity_data_bind);

        User user = new User("Bill", "Gates", 15);
        binder.setUser(user);
    }

}
