package com.sy.mvp.dagger.container;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sy.mvp.R;
import com.sy.mvp.dagger.inject.ApiService;
import com.sy.mvp.dagger.inject.UserManager;
import com.sy.mvp.dagger.component.DaggerUserComponent;
import com.sy.mvp.dagger.inject.UserStor;
import com.sy.mvp.dagger.module.UserModule;

import javax.inject.Inject;

/**
 * Created by huolala-sunyan on 2018/9/13.
 */

public class DaggerTestActivity extends AppCompatActivity {

    @Inject
    ApiService apiService;
    @Inject
    UserManager userManager;
    @Inject
    UserStor userStor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daggertest);

        DaggerUserComponent.builder()
                .userModule(new UserModule(this))
                .build()
                .inject(this);
        apiService.show();
        userManager.show();
        userStor.show();
    }
}
