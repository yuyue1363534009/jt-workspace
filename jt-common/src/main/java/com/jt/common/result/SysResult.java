package com.jt.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 亰淘系统json返回详细
 */
@Data
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public class SysResult {

    private Integer status; //200表示成功  201表示失败
    private String msg;		//后台返回值数据提示信息
    private Object data;	//后台返回任意数据

    public static SysResult ok(){

        return new SysResult(200, null, null);
    }

    public static SysResult ok(Object data) {

        return new SysResult(200, null, data);
    }

    public static SysResult ok(String msg,Object data) {

        return new SysResult(200, msg, data);
    }

    public static SysResult fail() {

        return new SysResult(201, null, null);
    }

    public static SysResult fail(String msg) {

        return new SysResult(201, msg, null);
    }

}
