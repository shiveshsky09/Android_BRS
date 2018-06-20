package com.example.sky.VO;

import com.example.sky.learn.InfoAddList;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sky on 07-Jul-15.
 */
public class GetAddVO implements Serializable
{
    private ArrayList<InfoAddList> infoAddLists;

    public ArrayList<InfoAddList> getInfoAddLists() {
        return infoAddLists;
    }

    public void setInfoAddLists(ArrayList<InfoAddList> infoAddLists) {
        this.infoAddLists = infoAddLists;
    }
}
