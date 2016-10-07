package com.example.pca.quickcoding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pca on 2016-10-07.
 */
public class MyAverage implements MyValues {
    List<Integer> list = new ArrayList<Integer>();

    public void setValues(List<Integer> list){
        this.list = list;
    }

    @Override
    public int getResult() {
        int sum=0;

        for(int i : this.list){
            sum+=i;
        }

        return sum/list.size();
    }
}
