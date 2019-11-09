package com.itjuana.itjuanademo.data.api;

import okhttp3.ResponseBody;
import retrofit2.http.GET;

/**
 * Created by jutorres on 11/2019.
 * Insulet Corporation
 * Andromeda
 */
public interface ITJuanaInterface {
    @GET("comments")
    public ResponseBody getComments();
}
