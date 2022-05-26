package com.example.letsgocustomer.interfaces;

import com.example.letsgocustomer.common.ConfigApp;
import com.example.letsgocustomer.model.fcm.FCMResponse;
import com.example.letsgocustomer.model.fcm.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=" + ConfigApp.CLOUD_MESSAGING_SERVER_KEY
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
