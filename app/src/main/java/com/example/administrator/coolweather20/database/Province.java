package com.example.administrator.coolweather20.database;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/3.
 */
//其中 id是自增长主键，province_name表示省名，province_code表示省级代号

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
