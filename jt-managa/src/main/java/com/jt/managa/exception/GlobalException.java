package com.jt.managa.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class GlobalException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView=new ModelAndView();
        if(e instanceof NullPointerException){
            modelAndView.addObject("errorMessage","系统发生异常，请联系管理员:"+"NullPointerException");
            modelAndView.setViewName("systemerror");
        }
        if(e instanceof ArithmeticException){
            modelAndView.addObject("errorMessage","系统发生异常，请联系管理员:"+"ArithmeticException");
            modelAndView.setViewName("systemerror");
        }
        return modelAndView;
    }

}
