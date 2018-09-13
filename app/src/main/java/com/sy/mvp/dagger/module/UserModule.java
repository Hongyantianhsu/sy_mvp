package com.sy.mvp.dagger.module;

import android.content.Context;

import com.sy.mvp.dagger.inject.ApiService;
import com.sy.mvp.dagger.inject.HttpClient;
import com.sy.mvp.dagger.inject.UserManager;
import com.sy.mvp.dagger.inject.UserStor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

@Module
public class UserModule {

    private Context context;
    public UserModule(Context context){
        this.context = context;
    }

    @Provides
    public ApiService provideApiService(HttpClient httpClient){
        return new ApiService(httpClient);
    }

    @Provides
    public UserManager provideUserManager(ApiService apiService){
        return new UserManager(apiService);
    }

    @Provides
    public UserStor provideUserStor(){
        return new UserStor(context);
    }
}
