package com.Wql.service.imp;

import com.Wql.dao.LoginDao;
import com.Wql.domain.LoginPojo;
import com.Wql.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Loginservice implements LoginService
{
    @Autowired
    private LoginDao loginDao;

    @Override
    public LoginPojo getByid(LoginPojo loginPojo) {
        LoginPojo byid = loginDao.getByid(loginPojo);
        return byid;
    }
}
