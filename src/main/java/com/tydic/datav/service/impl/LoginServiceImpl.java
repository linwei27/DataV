package com.tydic.datav.service.impl;

import com.tydic.datav.dao.mapper.TSysUserMapper;
import com.tydic.datav.dao.po.TSysUser;
import com.tydic.datav.dao.po.TSysUserExample;
import com.tydic.datav.service.LoginService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private TSysUserMapper userMapper;


    /**
     * 通过用户名称和密码查询当前用户
     *
     * @param loginName
     * @param passWord
     * @return
     */
    @Override
    public TSysUser userLogin(String loginName, String passWord) {
        TSysUserExample example = new TSysUserExample();
        com.tydic.datav.dao.po.TSysUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(loginName);
        criteria.andLoginPwdEqualTo(passWord);
        List<TSysUser> sysUserList = userMapper.selectByExample(example);
        return (null != sysUserList && sysUserList.size() > 0) ? sysUserList.get(0) : null;
    }
}
