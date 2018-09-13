package com.sy.mvp.module;

import com.sy.mvp.contract.AContract;
import com.sy.mvp.model.AModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

@Module
public class MainModule {

    private AContract.View view;
    public MainModule(AContract.View view){
        this.view = view;
    }

    @Provides
    public AContract.View provideView(){
        return view;
    }
    @Provides
    public AModel provideAModel(){
        return new AModel();
    }

}
