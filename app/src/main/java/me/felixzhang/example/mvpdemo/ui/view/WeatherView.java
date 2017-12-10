package me.felixzhang.example.mvpdemo.ui.view;

import me.felixzhang.example.mvpdemo.model.entity.Weather;

/**
 * Created by felix on 15/6/17.
 */
public interface WeatherView {
    void showLoading();

    void hideLoading();

    void showError();

    void setWeatherInfo(Weather weather);
}
