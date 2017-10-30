package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MS on 2017/10/30.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String id;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
