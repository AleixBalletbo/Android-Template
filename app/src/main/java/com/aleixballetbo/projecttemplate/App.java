package com.aleixballetbo.projecttemplate;

import android.app.Application;

import com.aleixballetbo.projecttemplate.dependencyinjection.application.ApplicationComponent;
import com.aleixballetbo.projecttemplate.dependencyinjection.application.ApplicationModule;
import com.aleixballetbo.projecttemplate.dependencyinjection.application.DaggerApplicationComponent;

public class App extends Application {

    ApplicationComponent component = null;

    public ApplicationComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.inject(this);
    }
}
