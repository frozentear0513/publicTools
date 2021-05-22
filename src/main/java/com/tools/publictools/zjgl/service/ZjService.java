/*
 * @projectName publictools
 * @package com.tools.publictools.zjgl.service
 * @className com.tools.publictools.zjgl.service.ZjService
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.tools.publictools.zjgl.service;

import com.tools.publictools.zjgl.dao.ZjDao;
import com.tools.publictools.zjgl.pojo.Zj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ZjService
 * @description TODO
 * @author wangwu
 * @date 2021年05月22日 10:30
 * @version 1.0.0
 */
@Service
public class ZjService {

    @Autowired
    private ZjDao zjDao;
    /**
     * ZjService
     * @description 获取所有组件
     * @return 组件集合
     * @author wangwu
     * @date 2021/5/22 10:31
     * @version 1.0.0
     */
    public List<Zj> getAllZj() {
        return zjDao.getAllZj();
    }
}
