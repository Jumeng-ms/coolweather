package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MS on 2017/10/26.
 */

/*城市*/
public class City extends DataSupport {

    private int id;
    private String CityName;    //城市名
    private int cityCode;       //城市代号
    private int provinceId;     //省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
