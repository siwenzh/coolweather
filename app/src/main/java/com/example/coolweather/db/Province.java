package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * xxx class
 *
 * @author 黄连威
 * @date 2020/9/13
 */
public class Province extends LitePalSupport
{

    private int id;

    private String  provinceName;

    private String provinceCode;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProvinceName()
    {
        return provinceName;
    }

    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }

    public String getProvinceCode()
    {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode)
    {
        this.provinceCode = provinceCode;
    }
}
