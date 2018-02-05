package com.aleixballetbo.projecttemplate.dependencyinjection.application;

import com.aleixballetbo.projecttemplate.App;
import com.aleixballetbo.projecttemplate.dependencyinjection.activity.ActivityComponent;
import com.aleixballetbo.projecttemplate.dependencyinjection.activity.ActivityModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(App application);

    ActivityComponent plus(ActivityModule activityModule, ViewModule viewModule);

}
