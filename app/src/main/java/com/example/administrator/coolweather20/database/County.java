package com.example.administrator.coolweather20.database;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/3.
 */

//其中 id 是自增长主键，county_name 表示县名，county_code表示县级代号，city_id 是 County表关联 City表的外键

public class County extends DataSupport{
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}