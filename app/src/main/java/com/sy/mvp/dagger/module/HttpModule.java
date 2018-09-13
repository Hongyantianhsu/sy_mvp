package com.sy.mvp.dagger.module;

import com.sy.mvp.dagger.inject.HttpClient;

import dagger.Module;
import dagger.Provides;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

@Module
public class HttpModule {

    @Provides
    public HttpClient provideHttpClient(){
        return new HttpClient();
    }
}
