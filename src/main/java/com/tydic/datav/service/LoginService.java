package com.tydic.datav.service;

import com.tydic.datav.dao.po.TSysUser;

public interface LoginService {

    /**
     * 通过用户名称和密码查询当前用户
     * @param loginName
     * @param passWord
     * @return
     */
    TSysUser userLogin(String loginName, String passWord);
}
