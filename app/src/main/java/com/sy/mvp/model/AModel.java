package com.sy.mvp.model;

import android.arch.lifecycle.ViewModel;

import com.sy.mvp.bean.A;
import com.sy.mvp.contract.AContract;

/**
 * Created by huolala-sunyan on 2018/8/6.
 */

public class AModel extends ViewModel implements IModel {
    @Override
    public void getData(AContract.ACallBack callBack) {
        A a = new A("sunyan",25);
        callBack.getDataSucceed(a);
    }

    @Override
    public void getErrorData(AContract.ACallBack callBack) {
        callBack.getDataFailed();
    }
}
