package com.example.sky.VO;

import java.io.Serializable;

/**
 * Created by sky on 08-Jul-15.
 */
public class UpdateProfileVO implements Serializable
{
    String name;
    String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
