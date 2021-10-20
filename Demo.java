package com.SpringbootJdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Demo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<String>Bookname()
    {
        List<String> names=new ArrayList<>();
        names.addAll(jdbcTemplate.queryForList("select book_name from book",String.class));
        return names;
    }
}