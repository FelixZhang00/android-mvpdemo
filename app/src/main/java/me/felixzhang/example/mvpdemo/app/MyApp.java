package me.felixzhang.example.mvpdemo.app;

import android.app.Application;

import me.felixzhang.example.mvpdemo.util.volley.VolleyRequest;

/**
 * Created by felix on 15/6/17.
 */
public class MyApp extends Application {
    private static MyApp instance;
    public MyApp(){
        instance=this;
    }

    public static Application getContext(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        VolleyRequest.buildRequestQueue(this);
    }
}
