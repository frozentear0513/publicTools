/*
 * @projectName public-tools
 * @package com.tools.publictools.version
 * @className com.tools.publictools.version.VersionController
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.tools.publictools.version;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * VersionController
 * @description TODO
 * @author wangwu
 * @date 2021年05月21日 19:49
 * @version 2.9.4
 */
@Controller
public class VersionController {

    @RequestMapping("/version")
   public String getVersion() {
       return "version.html";
   }
}
