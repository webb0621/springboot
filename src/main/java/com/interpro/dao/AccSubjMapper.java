/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AccSubjMapper
 * Author:   Webb
 * Date:     2018/9/13 10:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.interpro.dao;

import com.interpro.bean.AccSubj;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccSubjMapper {

    @Select("SELECT * FROM ACC_SUBJ WHERE SUBJ_CODE LIKE '1002%'")
    public List<AccSubj> queryAccSubjAll();

}
