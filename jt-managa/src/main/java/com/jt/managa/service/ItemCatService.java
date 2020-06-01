package com.jt.managa.service;

import com.jt.managa.pojo.ItemCatPojo;
import com.jt.managa.vo.EasyUITree;

import java.util.List;

public interface ItemCatService {

    ItemCatPojo selectItemCatNameById(Long itemCatId);

    List<EasyUITree> findItemCatCache(Long parentId);

}
