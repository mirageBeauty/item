package com.base.dao;

import com.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LableDao extends JpaRepository<Label,String> , JpaSpecificationExecutor<Label> {

}
