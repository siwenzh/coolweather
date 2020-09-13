package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * xxx class
 *
 * @author 黄连威
 * @date 2020/9/13
 */
public class County extends LitePalSupport
{
    private int id;

    private String countName;

    private String weatherId;

    private int cityId;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCountName()
    {
        return countName;
    }

    public void setCountName(String countName)
    {
        this.countName = countName;
    }

    public String getWeatherId()
    {
        return weatherId;
    }

    public void setWeatherId(String weatherId)
    {
        this.weatherId = weatherId;
    }

    public int getCityId()
    {
        return cityId;
    }

    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }
}
