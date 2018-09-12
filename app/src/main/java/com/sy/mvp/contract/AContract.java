package com.sy.mvp.contract;

import com.sy.mvp.bean.A;
import com.sy.mvp.model.IModel;
import com.sy.mvp.presenter.IPresenter;
import com.sy.mvp.view.IView;

/**
 * Created by huolala-sunyan on 2018/8/6.
 */

public class AContract {
    public interface View extends IView {
        void setInitData(A data);
        void showView();
    }

    public interface Presenter<V extends IView,M extends IModel> extends IPresenter{
        void getData();
    }

    public interface Model extends IModel{

    }


    public interface ACallBack{
        void getDataSucceed(A a);
        void getDataFailed();
    }
}
