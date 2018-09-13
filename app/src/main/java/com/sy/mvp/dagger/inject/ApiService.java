package com.sy.mvp.dagger.inject;

import com.sy.mvp.L;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

public class ApiService {

    private HttpClient httpClient;

    public ApiService(HttpClient httpClient){
        this.httpClient = httpClient;
        L.e("ApiService--create()");
    }

    public void show(){
        L.e("ApiService--show()");
    }

    public void request(){
        httpClient.request();
    }
}
