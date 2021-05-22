/*
 * @projectName publictools
 * @package com.tools.publictools.zjgl.controller
 * @className com.tools.publictools.zjgl.controller.ZjController
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.tools.publictools.zjgl.controller;

import com.tools.publictools.zjgl.pojo.Zj;
import com.tools.publictools.zjgl.service.ZjService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ZjController
 * @description TODO
 * @author wangwu
 * @date 2021年05月22日 10:29
 * @version 1.0.0
 */
@RestController
@RequestMapping("/zj")
public class ZjController {

    @Autowired
    private ZjService zjService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有组件", notes = "查询数据库中所有已注册的vue组件信息")
    public List<Zj> getZj(){
        return zjService.getAllZj();
    }
}
