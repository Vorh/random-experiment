package ru.vorh.dao.rowmappers;

import org.springframework.jdbc.core.RowMapper;
import ru.vorh.model.RandomNumber;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by vorh on 4/10/17.
 */
public class RandomNumberRM implements RowMapper<RandomNumber>{

    @Override
    public RandomNumber mapRow(ResultSet resultSet, int i) throws SQLException {
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.setCount(resultSet.getInt("count"));
        randomNumber.setNumber(resultSet.getInt("number"));
        return randomNumber;
    }
}
