package me.felixzhang.example.mvpdemo.model.impl;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import me.felixzhang.example.mvpdemo.model.WeatherModel;
import me.felixzhang.example.mvpdemo.model.entity.Weather;
import me.felixzhang.example.mvpdemo.presenter.OnWeatherListener;
import me.felixzhang.example.mvpdemo.util.volley.VolleyRequest;

/**
 * Created by felix on 15/6/17.
 */
public class WeatherModelImpl implements WeatherModel {
    @Override
    public void loadWeather(String cityNO, final OnWeatherListener listener) {
        /*数据层操作*/
        VolleyRequest.newInstance().newGsonRequest("http://www.weather.com.cn/data/sk/" + cityNO + ".html",
                Weather.class, new Response.Listener<Weather>() {
                    @Override
                    public void onResponse(Weather weather) {
                        if (weather != null) {
                            listener.onSuccess(weather);
                        } else {
                            listener.onError();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError();
                    }
                });
    }
}
