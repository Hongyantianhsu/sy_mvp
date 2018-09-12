package com.sy.mvp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sy.mvp.bean.A;
import com.sy.mvp.contract.AContract;
import com.sy.mvp.presenter.APresenter;

public class MainActivity extends BaseActivity<AContract.presenter> implements AContract.view{
    TextView tv;
    Button btn01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv = findViewById(R.id.tv);
        btn01 = findViewById(R.id.btn01);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.start();
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public AContract.presenter initPresenter() {
        return new APresenter(this);
    }

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
