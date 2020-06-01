package com.jt.managa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jt.managa.mapper.ItemCatMapper;
import com.jt.managa.pojo.ItemCatPojo;
import com.jt.managa.service.ItemCatService;
import com.jt.managa.vo.EasyUITree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Resource
    private ItemCatMapper itemCatMapper;

    @Override
    public ItemCatPojo selectItemCatNameById(Long itemCatId) {
        return itemCatMapper.selectById(itemCatId);
    }

    @Override
    public List<EasyUITree> findItemCatCache(Long parentId) {
        QueryWrapper<ItemCatPojo> itemCatPojoWrapper = new QueryWrapper<ItemCatPojo>();
        itemCatPojoWrapper.eq("parent_id ", parentId);
        List<ItemCatPojo> itemCatPojoList = itemCatMapper.selectList(itemCatPojoWrapper);
        List<EasyUITree> easyUITreeList = new ArrayList<EasyUITree>();
        for (ItemCatPojo itemCatTemp : itemCatPojoList) {
            EasyUITree easyUITree = new EasyUITree();
            easyUITree.setId(itemCatTemp.getId());
            easyUITree.setText(itemCatTemp.getName());
            String state = itemCatTemp.getIsParent() ? "closed" : "open";
            easyUITree.setState(state);
            easyUITreeList.add(easyUITree);
        }
        return easyUITreeList;
    }

}
