package ru.vorh.dao;

import ru.vorh.dao.rowmappers.RandomNumberRM;
import ru.vorh.model.RandomNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vorh on 4/10/17.
 */
public class RandomDao extends AbstractDao{


    public List<RandomNumber> getListRandomNumber(){

        String sql = "SELECT * FROM random_experiment ORDER BY key DESC";
        Map data = new HashMap();

        return getNpjt().query(sql,data, new RandomNumberRM());
    }

    public void insert(RandomNumber randomNumber){

        String sql = "INSERT INTO random_experiment key,count VALUES (:key, :count)";
        Map data = randomNumber.toMap();

        getNpjt().update(sql,data);
    }

    public RandomNumber getNumberByKey(int key){

        String sql = "SELECT * FROM random_experiment WHERE key = :key";

        Map data = new HashMap();
        data.put("key", key);

        return getNpjt().queryForObject(sql,data, new RandomNumberRM());
    }
}
