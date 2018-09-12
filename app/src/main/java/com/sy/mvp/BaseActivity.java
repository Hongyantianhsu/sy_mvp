package com.sy.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sy.mvp.contract.AContract;

/**
 * Created by huolala-sunyan on 2018/8/6.
 */

public abstract class BaseActivity<T extends AContract.Presenter> extends AppCompatActivity {

    public T presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayout());
        this.presenter = initPresenter();
    }

    public abstract int getLayout();

    public abstract T initPresenter();
}
