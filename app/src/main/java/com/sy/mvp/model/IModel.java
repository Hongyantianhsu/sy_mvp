package com.sy.mvp.model;

import com.sy.mvp.contract.AContract;

/**
 * Created by huolala-sunyan on 2018/8/6.
 */

public interface IModel {
    void getData(AContract.ACallBack callBack);

    void getErrorData(AContract.ACallBack callBack);
}
