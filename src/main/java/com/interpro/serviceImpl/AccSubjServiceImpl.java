/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AccSubjServiceImpl
 * Author:   Webb
 * Date:     2018/9/13 10:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.interpro.serviceImpl;

import com.interpro.bean.AccSubj;
import com.interpro.dao.AccSubjMapper;
import com.interpro.service.AccSubjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccSubjServiceImpl implements AccSubjService {

    @Autowired
    private AccSubjMapper accSubjMapper = null;

    @Override
    public List<AccSubj> queryAccSubjAll() {

        return accSubjMapper.queryAccSubjAll();

    }
}
