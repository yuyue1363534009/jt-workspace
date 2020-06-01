package com.jt.managa.controller;

import com.jt.common.result.SysResult;
import com.jt.managa.pojo.ItemPojo;
import com.jt.managa.service.ItemService;
import com.jt.managa.vo.ItemEasyUITable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

    @Resource
    private ItemService itemService;

    /**
     * 查询全部商品（分页）备注：商品类别名称在 ItemCatController.
     *
     * @param page 当前页数
     * @param rows 每页显示行数
     * @return ItemEasyUITable
     */
    @RequestMapping(value = "/query")
    public ItemEasyUITable selectItem(Integer page, Integer rows) {
        return itemService.findItemByPage(page, rows);
    }

    /**
     * 删除选中的商品
     *
     * @param ids 商品id
     * @return SysResult
     */
    @RequestMapping(value = "/delete")
    public SysResult deleteItem(Long[] ids) {

        return itemService.deleteItems(ids);

    }

    @RequestMapping(value = "/save")
    public SysResult insertItem(ItemPojo itemPojo, String desc) {
        int i=100/0;
        return itemService.insertItem(itemPojo, desc);

    }

}
