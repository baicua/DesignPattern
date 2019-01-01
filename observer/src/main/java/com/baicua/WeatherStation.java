package com.baicua;

import com.baicua.Data.DisplayEntity;
import com.baicua.Interface.Observer;

/**
 * @ Author     ：xutong
 * @ Date       ：Created in 7:46 PM 2018/12/31
 * @ Description：${description}
 * @ Modified By：
 */
public class WeatherStation {
    CurrentConditionsDisplay observer =null;
    public  void run(DisplayEntity entity ) {
        WeatherData weatherData = new WeatherData();
        observer = new CurrentConditionsDisplay(weatherData);
        weatherData.setDisplayEntity(entity);
    }

}
