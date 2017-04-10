package ru.vorh.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vorh on 4/10/17.
 */
public class RandomNumber {

    private int number;
    private int count;

    public RandomNumber() {
        count = 0;
    }

    public Map toMap(){
        Map data = new HashMap();
        data.put("number", number);
        data.put("count",count);
        return data;
    }

    public void increment(){
        count++;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
