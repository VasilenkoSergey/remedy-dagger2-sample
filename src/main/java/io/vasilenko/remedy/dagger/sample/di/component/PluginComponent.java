package io.vasilenko.remedy.dagger.sample.di.component;

import dagger.Component;
import io.vasilenko.remedy.dagger.sample.DaggerSamplePlugin;
import io.vasilenko.remedy.dagger.sample.di.module.PluginServiceModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = PluginServiceModule.class)
public interface PluginComponent {

    void inject(DaggerSamplePlugin plugin);
}
