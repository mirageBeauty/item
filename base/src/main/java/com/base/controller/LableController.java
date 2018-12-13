package com.base.controller;

import com.base.pojo.Label;
import com.base.service.LableService;
import com.common.entity.Result;
import com.common.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/label")
public class LableController {

    @Autowired
    private LableService lableService;

    //增加一条数据
    @PostMapping()
    public Result addLable(@RequestBody Label label) {
        Result result = null;
        lableService.addLable(label);
        return result = new Result(true, StatusCode.OK, "添加成功");
    }

    //查询全部数据
    @GetMapping
    public Result findAll() {
        Result result = null;
        return result = new Result(true, StatusCode.OK, "查询成功", lableService.findAll());
    }

    //根据ID修改数据
    @PutMapping(value = "/{id}")
    public Result update(@RequestBody Label label, @PathVariable String id) {
        Result result = null;
        label.setId(id);
        lableService.updateById(label);
        return result = new Result(true, StatusCode.OK, "修改成功");
    }

    //根据ID删除数据
    @DeleteMapping(value = "/{id}")
    public Result deleteById(@PathVariable String id) {
        Result result = null;
        lableService.deleteById(id);
        return result = new Result(true, StatusCode.OK, "删除成功");
    }

    //根据id查询数据
    @GetMapping(value = "/{id}")
    public Result findById(@PathVariable String id){
        Result result = null;
        return result = new Result(true,StatusCode.OK,"查询成功",lableService.findById(id));

    }

    //测试method
    public void test01(ModelMap map){


    }
}
