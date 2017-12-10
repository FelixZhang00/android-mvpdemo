package me.felixzhang.example.mvpdemo.presenter.impl;

import me.felixzhang.example.mvpdemo.model.WeatherModel;
import me.felixzhang.example.mvpdemo.model.entity.Weather;
import me.felixzhang.example.mvpdemo.model.impl.WeatherModelImpl;
import me.felixzhang.example.mvpdemo.presenter.OnWeatherListener;
import me.felixzhang.example.mvpdemo.presenter.WeatherPresenter;
import me.felixzhang.example.mvpdemo.ui.view.WeatherView;

/**
 * Created by felix on 15/6/17.
 * 天气 Prestener实现
 */
public class WeatherPresenterImpl implements WeatherPresenter, OnWeatherListener {
    /*Presenter作为中间层，持有View和Model的引用*/
    private WeatherView weatherView;
    private WeatherModel weatherModel;

    public WeatherPresenterImpl(WeatherView weatherView) {
        this.weatherView = weatherView;
        weatherModel = new WeatherModelImpl();
    }

    @Override
    public void getWeather(String cityNO) {
        weatherView.showLoading();
        weatherModel.loadWeather(cityNO, this);
    }

    @Override
    public void onSuccess(Weather weather) {
//        AsyncTask asyncTask = null;
//        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

        weatherView.hideLoading();
        weatherView.setWeatherInfo(weather);
    }

    @Override
    public void onError() {
        weatherView.hideLoading();
        weatherView.showError();
    }


}
