package com.jt.managa.service;

import com.jt.common.result.SysResult;
import com.jt.managa.pojo.ItemPojo;
import com.jt.managa.vo.ItemEasyUITable;

public interface ItemService {

    ItemEasyUITable findItemByPage(Integer page, Integer rows);

    SysResult deleteItems(Long[] ids);

    SysResult insertItem(ItemPojo itemPojo,String desc);

}
