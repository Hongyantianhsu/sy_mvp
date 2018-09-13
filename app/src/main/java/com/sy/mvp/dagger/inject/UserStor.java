package com.sy.mvp.dagger.inject;

import android.content.Context;

import com.sy.mvp.L;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

public class UserStor {

    public UserStor(Context context){
        L.e("UserSotr--create()");
    }

    public void show(){
        L.e("UserStor--show()");
    }
}
