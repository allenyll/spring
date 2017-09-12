package com.yll.dao;

import com.yll.entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yll on 17-9-12.
 */
public interface DemoDao extends CrudRepository<Demo,Long> {
}
