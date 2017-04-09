package ru.vorh;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by vorh on 4/9/17.
 */
public class Generator {

    private Random random = new Random();
    private Map<Integer,Integer> data = new HashMap<>();

    public int get(int start, int end){
        return start + random.nextInt(end);
    }

    public void put(int key){
        if (data.containsKey(key)) {
            Integer integer = data.get(key);
            integer++;
            data.put(key,integer);
        }else {
            data.put(key,1);
        }
    }

    public Map<Integer,Integer> getData(){
        return data;
    }

}
