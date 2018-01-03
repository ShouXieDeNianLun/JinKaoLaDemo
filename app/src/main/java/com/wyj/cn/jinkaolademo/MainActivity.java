package com.wyj.cn.jinkaolademo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.wyj.cn.jinkaolademo.ui.WhiteBoardFragment;

public class MainActivity extends FragmentActivity{
    private WhiteBoardFragment whiteBoardFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();


    }


    private void initview() {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        //获取WhiteBoardFragment实例
        whiteBoardFragment = WhiteBoardFragment.newInstance();
        transaction.add(R.id.controlLayout, whiteBoardFragment,"wb").commit();

    }


}
