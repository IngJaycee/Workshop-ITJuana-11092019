package com.itjuana.itjuanademo.data.api.di;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = NetworkModule.class)
public interface NetworkComponent {
}
