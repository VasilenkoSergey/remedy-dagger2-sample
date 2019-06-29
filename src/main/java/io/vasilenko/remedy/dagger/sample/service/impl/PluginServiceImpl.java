package io.vasilenko.remedy.dagger.sample.service.impl;

import io.vasilenko.remedy.dagger.sample.service.PluginService;

public class PluginServiceImpl implements PluginService {

    @Override
    public String greeting(String name) {
        return "Hello " + name;
    }
}
