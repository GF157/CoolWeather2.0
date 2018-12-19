package com.example.administrator.coolweather20.database;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/3.
 */

//其中 id是自增长主键，city_name表示城市名，city_code表示市级代号，province_id是 City表关联 Province表的外键。
public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return this.cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
