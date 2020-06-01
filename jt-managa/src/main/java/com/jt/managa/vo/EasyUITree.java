package com.jt.managa.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 为了进行EasyUITree的属性结构展现
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class EasyUITree {

    /*
    元素id
     */
    private Long id;

    /*
    元素文本内容
     */
    private String text;

    /*
    "closed":节点默认关闭 "open":节点打开
     */
    private String state;

}
