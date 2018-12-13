package com.base.service;

import com.base.dao.LableDao;
import com.base.pojo.Label;
import com.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LableService {
    @Autowired
    private IdWorker idWorker;

    @Autowired
    private LableDao lableDao;

    //增加一条数据
    public void addLable(Label label){
        label.setId(idWorker.nextId()+"");
        int i= 1/0;
        lableDao.save(label);
    }

    //查询所有
    public List<Label> findAll(){

        return lableDao.findAll();

    }

    //根据ID查询数据
    public Label findById(String id){
        return lableDao.findOne(id);
    }

    //根据id删除一条数据

    public void deleteById(String id){
        lableDao.delete(id);
    }

    //修改标签
    public void updateById(Label label) {
        lableDao.save(label);
    }
}
