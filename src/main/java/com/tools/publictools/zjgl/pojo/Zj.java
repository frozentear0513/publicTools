/*
 * @projectName publictools
 * @package com.tools.publictools.zjgl.pojo
 * @className com.tools.publictools.zjgl.pojo.Zj
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.tools.publictools.zjgl.pojo;

import lombok.Data;

/**
 * Zj
 * @description vue组件类
 * @author wangwu
 * @date 2021年05月22日 10:26
 * @version 1.0.0
 */
@Data
public class Zj {
    /*
     * 主键
     */
    private String cBh;

    /*
     * 组件名称
     */
    private String cZjmc;

    /*
     * 组件说明
     */
    private String cBz;

    /*
     * 创建时间
     */
    private String dtCjsj;

    /*
     * 最后更新时间
     */
    private String dtZhxgsj;

}
