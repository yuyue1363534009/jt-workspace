package com.jt.managa.aop;

import com.jt.common.result.SysResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //针对Controller的aop
@Slf4j
public class ExceptionAspect {

    @ExceptionHandler(value = RuntimeException.class)
    public SysResult exceptionResult(Exception e){
        e.printStackTrace();;
        log.debug("异常信息",e);
        return SysResult.fail();
    }

}
