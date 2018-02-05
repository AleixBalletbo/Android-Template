package com.aleixballetbo.projecttemplate.dependencyinjection.activity;

import com.aleixballetbo.projecttemplate.dependencyinjection.application.ViewModule;
import com.aleixballetbo.projecttemplate.dependencyinjection.scope.PerActivity;
import com.aleixballetbo.projecttemplate.main.MainActivity;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {ActivityModule.class, ViewModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);
}
