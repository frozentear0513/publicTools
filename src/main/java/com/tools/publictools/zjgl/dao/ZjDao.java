/*
 * @projectName publictools
 * @package com.tools.publictools.zjgl.dao
 * @className com.tools.publictools.zjgl.dao.Zjdao
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.tools.publictools.zjgl.dao;

import com.tools.publictools.zjgl.pojo.Zj;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Zjdao
 * @description ZjDao
 * @author wangwu
 * @date 2021年05月22日 10:36
 * @version 1.0.0
 */
@Mapper
public interface ZjDao {

    List<Zj> getAllZj();
}
