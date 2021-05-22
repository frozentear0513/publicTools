/*
 * @projectName public-tools
 * @package com.tools.publictools.version
 * @className com.tools.publictools.version.VersionController
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.tools.publictools.version;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * VersionController
 * @description 应用版本类
 * @author wangwu
 * @date 2021年05月21日 19:49
 * @version 1.0.0
 */
@Controller
public class VersionController {
   @RequestMapping(value = "/version", method = RequestMethod.GET)
   @ApiOperation(value = "查询当前版本信息", notes = "查询当前应用的版本信息")
   public String getVersion() {
       return "version.html";
   }
}
