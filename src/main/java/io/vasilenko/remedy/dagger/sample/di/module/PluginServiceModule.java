package io.vasilenko.remedy.dagger.sample.di.module;

import dagger.Module;
import dagger.Provides;
import io.vasilenko.remedy.dagger.sample.service.PluginService;
import io.vasilenko.remedy.dagger.sample.service.impl.PluginServiceImpl;

import javax.inject.Singleton;

@Module
public class PluginServiceModule {

    @Provides
    @Singleton
    PluginService providePluginService() {
        return new PluginServiceImpl();
    }
}
