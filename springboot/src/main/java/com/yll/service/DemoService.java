package com.yll.service;

import com.yll.dao.DemoDao;
import com.yll.entity.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by yll on 17-9-12.
 */
@Service
public class DemoService {

    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(Demo demo){
        demoDao.save(demo);
    }

}
