package com.jt.managa.service.impl;

import com.jt.common.result.SysResult;
import com.jt.managa.mapper.ItemDescMapper;
import com.jt.managa.mapper.ItemMapper;
import com.jt.managa.pojo.ItemDescPojo;
import com.jt.managa.pojo.ItemPojo;
import com.jt.managa.service.ItemService;
import com.jt.managa.vo.ItemEasyUITable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;

    @Resource
    private ItemDescMapper itemDescMapper;

    /**
     * 查询全部商品（分页）
     * @param page 当前页数
     * @param rows 每页显示行数
     * @return ItemEasyUITable
     */
    @Transactional(readOnly = true)
    @Override
    public ItemEasyUITable findItemByPage(Integer page, Integer rows) {

        int total = itemMapper.selectCount(null);
        int start = (page - 1) * rows;
        List<ItemPojo> itemPojoList = itemMapper.findItemByPage(start, rows);

        return new ItemEasyUITable(total, itemPojoList);
    }

    /**
     * 删除选中的商品
     * @param ids 商品id
     * @return SysResult
     */
    @Transactional
    @Override
    public SysResult deleteItems(Long[] ids) {
        List<Long> idList = new ArrayList<Long>();
        for (Long id : ids) {
            idList.add(id);
        }
        try {
            itemMapper.deleteBatchIds(idList);
            itemDescMapper.deleteBatchIds(idList);
        } catch (Exception e) {
            return SysResult.fail("删除商品失败");
        }
        return SysResult.ok();
    }

    @Transactional
    @Override
    public SysResult insertItem(ItemPojo itemPojo,String desc) {
        itemPojo.setCreated(new Date());
        itemPojo.setUpdated(itemPojo.getCreated());
        itemPojo.setStatus(1);

        ItemDescPojo itemDescPojo = new ItemDescPojo();
        itemDescPojo.setItemId(itemPojo.getId());
        itemDescPojo.setItemDesc(desc);
        itemDescPojo.setCreated(itemPojo.getCreated());
        itemDescPojo.setUpdated(itemPojo.getUpdated());
        try {
            itemMapper.insert(itemPojo);
            itemDescMapper.insert(itemDescPojo);
        } catch (Exception e) {
            return SysResult.fail();
        }
        return SysResult.ok();
    }

}
