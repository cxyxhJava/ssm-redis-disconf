package com.frank.center.service;

import com.frank.center.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XG on 2017/5/31.
 */
@Service
public class BaseServer {

    @Autowired
    private BaseDao baseDao;

    public String getHrllo(){
        return baseDao.getHello();
    }

}
