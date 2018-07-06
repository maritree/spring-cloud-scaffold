package com.maritree.authority.buss.controller;

import com.maritree.authority.buss.entity.Data;
import com.maritree.authority.buss.service.DataService;
import com.maritree.authority.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;


/**
 * RestFul接口
 *
 * @author maritree
 * @since 2018-06-29
 */
@RestController
@RequestMapping("/data")
public class DataController {
    Logger logger = LoggerFactory.getLogger(DataController.class);

    @Autowired
    DataService dataService;


    @PostMapping("/insert")
    public Object insert(@RequestBody Data data) {
        dataService.insert(data);
        return Result.genSuccessResult();
    }

    @GetMapping("/deleteById/{id}")
    public Object delete(@PathVariable Serializable id) {
        dataService.deleteById(id);
        return Result.genSuccessResult();

    }

    @PostMapping("/update")
    public Object update(@RequestBody Data data) {
        dataService.updateById(data);
        return Result.genSuccessResult();
    }

    @GetMapping("/list")
    public Object list() {
        List<Data> dataList = dataService.selectList(null);
        return Result.genSuccessResult(dataList);
    }

}

