package me.felixzhang.example.mvpdemo.model;

import me.felixzhang.example.mvpdemo.presenter.OnWeatherListener;

/**
 * Created by felix on 15/6/17.
 * 天气Model接口
 */
public interface WeatherModel {

    void loadWeather(String cityNO, OnWeatherListener listener);
}
