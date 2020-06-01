package com.jt.managa.vo;

import com.jt.managa.pojo.ItemPojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 商品EasyUI列表属性
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ItemEasyUITable {

    private Integer total;

    private List<ItemPojo> rows;
}
