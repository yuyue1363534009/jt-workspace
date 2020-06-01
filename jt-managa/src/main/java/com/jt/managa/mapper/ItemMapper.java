package com.jt.managa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.managa.pojo.ItemPojo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper extends BaseMapper<ItemPojo> {

    //@Select("select * from tb_item order by updated desc limit #{start},#{rows}")
    List<ItemPojo> findItemByPage(@Param("start") int start, @Param("rows") int rows);
}
