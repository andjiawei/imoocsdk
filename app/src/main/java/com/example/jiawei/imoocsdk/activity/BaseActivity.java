package com.example.jiawei.imoocsdk.activity;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.jiawei.imoocsdk.utils.StatusBarUtil;

/**
 * Created by jiawei on 2017/3/16.
 */

public class BaseActivity extends AppCompatActivity {
    public String TAG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getComponentName().getShortClassName();

    }

    public void changeStatusBarColor(@ColorRes int color) {
        StatusBarUtil.setStatusBarColor(this, color);
    }
}
