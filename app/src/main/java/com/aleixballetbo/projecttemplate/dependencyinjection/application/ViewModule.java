package com.aleixballetbo.projecttemplate.dependencyinjection.application;


import com.aleixballetbo.projecttemplate.main.MainView;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewModule {

    private MainView view;

    public ViewModule(MainView view) {
        this.view = view;
    }

    @Provides
    MainView providesMainView(){
        return view;
    }
}
