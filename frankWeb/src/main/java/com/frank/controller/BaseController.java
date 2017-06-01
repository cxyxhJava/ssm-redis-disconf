package com.frank.controller;

import com.frank.center.dao.BaseDao;
import com.frank.center.service.BaseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by XG on 2017/5/31.
 */
@Controller
public class BaseController {
    @Autowired
    private BaseDao baseDao;

    @Autowired
    private BaseServer baseServer;

    @RequestMapping("/hello")
    public String getHello(){
        return baseServer.getHrllo();
    }
}
