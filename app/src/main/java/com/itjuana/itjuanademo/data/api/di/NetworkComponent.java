package com.itjuana.itjuanademo.data.api.di;

import com.itjuana.itjuanademo.repository.MainRepository;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = NetworkModule.class)
public interface NetworkComponent {
    void inject(MainRepository mainRepository);
}
