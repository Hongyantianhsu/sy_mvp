package com.sy.mvp.presenter;

import com.sy.mvp.contract.AContract;
import com.sy.mvp.model.IModel;
import com.sy.mvp.view.IView;

/**
 * Created by huolala-sunyan on 2018/8/6.
 */

public abstract class BasePresenter<M extends IModel,V extends IView> implements AContract.Presenter {

    public V view;
    public M model;
    public BasePresenter(V v,M m){
        this.view = v;
        this.model = m;
    }

}
