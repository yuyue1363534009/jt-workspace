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
@TableName("tb_item_desc")
public class ItemDescPojo extends BasePojo {

    /*
    商品id
     */
    private Long itemId;

    /*
    商品详情
     */
    private String itemDesc;
}
