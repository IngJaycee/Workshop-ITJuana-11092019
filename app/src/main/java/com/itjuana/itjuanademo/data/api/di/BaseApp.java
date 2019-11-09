package com.itjuana.itjuanademo.data.api.di;

import android.app.Application;


public class BaseApp extends Application {
    NetworkComponent networkComponent;

    @Override
    public void onCreate() {
        super.onCreate();
//        networkComponent = DaggerNetworkComponent
//                .builder()
//                .networkModule(new NetworkModule(this))
//                .build();
    }

    public NetworkComponent getNetworkComponent() {
        return networkComponent;
    }
}
