package com.sy.mvp.presenter;

import com.sy.mvp.bean.A;
import com.sy.mvp.contract.AContract;
import com.sy.mvp.model.AModel;

/**
 * Created by huolala-sunyan on 2018/8/6.
 */

public class APresenter extends BasePresenter<AModel,AContract.View> {

    public APresenter(AContract.View view, AModel aModel) {
        super(view, aModel);
    }

    @Override
    public void onStart() {
        view.showProgressDialog();
        model.getData(new AContract.ACallBack() {

            @Override
            public void getDataSucceed(A a) {
                view.dissmissProgressDialog();
                view.setInitData(a);
            }

            @Override
            public void getDataFailed() {

            }
        });
    }

    @Override
    public void onStop() {

    }

    @Override
    public void getData() {

    }
}
