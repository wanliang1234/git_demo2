package com.Wql.service;

import com.Wql.domain.LoginPojo;
import org.springframework.transaction.annotation.Transactional;

public interface LoginService
{
    @Transactional
    LoginPojo getByid(LoginPojo loginPojo);
}
