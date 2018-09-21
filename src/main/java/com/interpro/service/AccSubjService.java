/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AccSubjService
 * Author:   Webb
 * Date:     2018/9/13 10:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.interpro.service;

import com.interpro.bean.AccSubj;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AccSubjService {
    public List<AccSubj> queryAccSubjAll();
}
