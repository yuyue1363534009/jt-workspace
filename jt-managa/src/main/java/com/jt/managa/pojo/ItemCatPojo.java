package com.jt.managa.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jt.common.pojo.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_item_cat")
public class ItemCatPojo extends BasePojo {

    /*
    商品id
     */
    private Long id;

    /*
    商品id父 ID=0时，代表一级类目
     */
    private Long parentId;

    /*
    商品类别名称
     */
    private String name;

    /*
    商品状态
     */
    private Integer status;

    private Integer sortOrder;

    /*
    是否为父级
     */
    private Boolean isParent;

}
