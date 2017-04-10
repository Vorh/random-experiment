package ru.vorh.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vorh on 4/10/17.
 */
public class RandomNumber {

    private int key;
    private int count;


    public Map toMap(){
        Map data = new HashMap();
        data.put("key", key);
        data.put("count",count);
        return data;
    }


    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
