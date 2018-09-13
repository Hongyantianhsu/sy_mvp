package com.sy.mvp.component;

import com.sy.mvp.MainActivity;
import com.sy.mvp.module.MainModule;

import dagger.Component;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
