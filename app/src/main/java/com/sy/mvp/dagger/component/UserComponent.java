package com.sy.mvp.dagger.component;

import com.sy.mvp.dagger.container.DaggerTestActivity;
import com.sy.mvp.dagger.module.HttpModule;
import com.sy.mvp.dagger.module.UserModule;

import dagger.Component;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

@Component(modules = {UserModule.class,HttpModule.class})
public interface UserComponent {
    void inject(DaggerTestActivity daggerTestActivity);
}
