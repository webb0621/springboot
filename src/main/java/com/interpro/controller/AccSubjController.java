/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AccSubjController
 * Author:   Webb
 * Date:     2018/9/11 15:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.interpro.controller;

import com.interpro.bean.AccSubj;
import com.interpro.serviceImpl.AccSubjServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AccSubjController {

    @Autowired
    private AccSubjServiceImpl accSubjService;

    @GetMapping(value = "/queryAccSubjAll")
    public List<AccSubj> queryAccSubjAll(Map<String, Object> map){

      return accSubjService.queryAccSubjAll();

    }


}
