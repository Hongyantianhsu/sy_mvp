package com.sy.mvp.dagger.inject;

import com.sy.mvp.L;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

public class ApiService {

    public ApiService(){
        L.e("ApiService--create()");
    }

    public void show(){
        L.e("ApiService--show()");
    }
}
