package ru.GeekBrains.weather;

import java.io.Serializable;

public class Weather implements Serializable {
    private String cityName = "Новосибирск";

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
