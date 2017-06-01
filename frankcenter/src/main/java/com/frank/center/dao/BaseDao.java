package com.frank.center.dao;


import org.springframework.stereotype.Repository;

/**
 * Created by XG on 2017/5/31.
 */
@Repository
public class BaseDao {

    public String getHello(){
        return "hello world";
    }
}
