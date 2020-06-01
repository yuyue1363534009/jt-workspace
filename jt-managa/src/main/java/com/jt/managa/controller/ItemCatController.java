package com.jt.managa.controller;

import com.jt.managa.pojo.ItemCatPojo;
import com.jt.managa.service.ItemCatService;
import com.jt.managa.vo.EasyUITree;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/item/cat")
public class ItemCatController {

    @Resource
    private ItemCatService itemCatService;

    @RequestMapping(value = "/queryItemName")
    public String selectItemCatName(Long itemCatId){
        ItemCatPojo itemCatPojo = itemCatService.selectItemCatNameById(itemCatId);
        return itemCatPojo.getName();
    }

    @RequestMapping(value = "/list")
    public List<EasyUITree> findItemCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {

        return itemCatService.findItemCatCache(parentId);
    }

}
