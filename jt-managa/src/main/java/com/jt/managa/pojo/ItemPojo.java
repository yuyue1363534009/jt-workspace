package com.jt.managa.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jt.common.pojo.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.javassist.SerialVersionUID;
import org.springframework.data.annotation.Id;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_item")
public class ItemPojo extends BasePojo {

    @TableId(type = IdType.AUTO)
    /*
    商品id
     */
    private Long id;

    /*
    商品标题
     */
    private String title;

    /*
    商品卖点
     */
    private String sellPoint;

    /*
    商品的价格 精度问题  0.00000000001 + .0999999999999= 0.99999999999999   2 计算速度.  int > long > dubbo
     */
    private Long price;

    /*
    商品的数量
     */
    private Integer num;

    /*
    二维码
     */
    private String barcode;

    /*
    图片信息 在数据库中保存多张图片地址 中间使用","号分割
     */
    private String image;

    /*
    商品分类id
     */
    private Long cid;

    /*
    商品的状态  1正常，2下架，3删除
     */
    private Integer status;

//    public String[] getImage() {
//        return image.split(",");
//    }
}
