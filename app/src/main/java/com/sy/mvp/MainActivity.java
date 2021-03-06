package com.sy.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sy.mvp.bean.A;
import com.sy.mvp.component.DaggerMainComponent;
import com.sy.mvp.contract.AContract;
import com.sy.mvp.dagger.container.DaggerTestActivity;
import com.sy.mvp.module.MainModule;
import com.sy.mvp.presenter.APresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<AContract.Presenter> implements AContract.View{
    TextView tv;
    Button btn01;
    @Inject
    APresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv = findViewById(R.id.tv);
        btn01 = findViewById(R.id.btn01);

        DaggerMainComponent.builder().mainModule(new MainModule(this)).build().inject(this);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onStart();
            }
        });

        findViewById(R.id.btn02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DaggerTestActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

//    @Override
//    public AContract.Presenter initPresenter() {
//        return new APresenter(this,new AModel());
//    }

    @Override
    public void showProgressDialog() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv.setText("正在请求数据...");
            }
        });
    }

    @Override
    public void dissmissProgressDialog() {
        tv.setText("请求数据成功...");
    }

    @Override
    public void setInitData(final A data) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv.setText(data.name+"  "+data.age);
            }
        });
    }

    @Override
    public void showView() {

    }
}
