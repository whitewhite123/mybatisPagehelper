package com.msj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msj.mapper.UserMapper;
import com.msj.pojo.User;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/select")
    public String select(int currentPage, int pageSize, Map<String,Object> map){
        PageHelper.startPage(currentPage,pageSize);
        List<User> userList = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        System.out.println(pageInfo);
        System.out.println(pageInfo.getList());
        map.put("userList",pageInfo.getList());
        return ("pages/user.jsp");
    }
}
