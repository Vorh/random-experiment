package ru.vorh.dao;

import org.springframework.dao.DataAccessException;
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

        String sql = "INSERT INTO random_experiment (number, count)VALUES (:number, :count) " +
                "ON CONFLICT (number) DO UPDATE " +
                "SET count = :count";
        Map data = randomNumber.toMap();

        getNpjt().update(sql,data);
    }

    public RandomNumber getNumberByKey(int key){

        String sql = "SELECT * FROM random_experiment WHERE number = :number";

        Map data = new HashMap();
        data.put("key", key);

        try {
            return getNpjt().queryForObject(sql,data, new RandomNumberRM());
        } catch (DataAccessException e) {
            RandomNumber randomNumber = new RandomNumber();
            randomNumber.setNumber(key);
            return randomNumber;
        }
    }

    public void clearStore(){
        String sql ="DELETE FROM random_experiment";
        Map data = createMap();
        getNpjt().update(sql,data);
    }
}
