package com.example.pca.quickcoding;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by pca on 2016-10-07.
 */
public class MyMinimum implements  MyValues{
    List<Integer> list = new ArrayList<Integer>();

    public void setValues(List<Integer> list){
        this.list = list;
    }

    @Override
    public int getResult() {
        int mini=list.get(0);

        for(int i : this.list){
            if(i<mini)
                mini = i;
        }
        return mini;
    }
}
