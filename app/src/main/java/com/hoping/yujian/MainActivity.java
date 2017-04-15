package com.hoping.yujian;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hoping.yujian.app.App;
import com.hoping.yujian.greendao.DaoSession;
import com.hoping.yujian.ui.common.BaseActivity;

import butterknife.InjectView;

public class MainActivity extends BaseActivity {


    @InjectView(R.id.systembar)
    ImageView systembar;
    @InjectView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        int statusBarHeight = getStatusBarHeight(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, statusBarHeight);
        systembar.setLayoutParams(layoutParams);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        DaoSession daoSession = App.getmDaoSession();
    }
}
