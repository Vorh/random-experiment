package ru.vorh.dao;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vorh on 4/10/17.
 */
public class AbstractDao {

    private DriverManagerDataSource dataSource;

    public AbstractDao() {
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/sundries");
    }

    public NamedParameterJdbcTemplate getNpjt(){
        return new NamedParameterJdbcTemplate(dataSource);
    }

    public Map createMap(){
        return new HashMap();
    }
}
