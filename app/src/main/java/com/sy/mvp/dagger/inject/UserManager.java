package com.sy.mvp.dagger.inject;

import com.sy.mvp.L;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

public class UserManager {
    public UserManager(ApiService apiService){
        L.e("UserManager--create()");
    }

    public void show(){
        L.e("UserManager--show()");
    }
}
