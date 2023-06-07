package com.Wql.controller;

import com.Wql.MyException.BusinessException;
import com.Wql.MyException.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyCon
{
    @ExceptionHandler(SystemException.class)
    public Result system(SystemException systemException)
    {
        return new Result(systemException.getCode(),systemException.getMessage(),systemException);
    }
    @ExceptionHandler(BusinessException.class)
    public Result system(BusinessException businessException)
    {
        return new Result(businessException.getCode(),businessException.getMessage(),businessException);
    }
    @ExceptionHandler(Exception.class)
    public Result system(Exception exception)
    {
        return new Result(Code.Exception_ERR,"您的网络不佳;请稍后重试",exception);
    }
}
