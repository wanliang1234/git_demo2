package com.Wql.controller;

import com.Wql.domain.LoginPojo;
import com.Wql.service.imp.Loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
@RequestMapping("/logins")
public class LoginController
{
    @Autowired
    private Loginservice loginservice;

    @PostMapping
    public LoginResult getByid(@RequestBody LoginPojo loginPojo, HttpServletRequest request, HttpServletResponse response)
    {
        LoginPojo byid = loginservice.getByid(loginPojo);
        int code=byid!=null?Code.Get_OK:Code.Get_ERR;
        String msg;
        String token=null;
        if(byid!=null)
        {
            token= UUID.randomUUID().toString();

            HttpSession session = request.getSession();
            session.setAttribute("token",token);

            msg="登陆成功";
        }else {
            msg="登陆失败";
        }
        return new LoginResult(code,msg,token);
    }
}
