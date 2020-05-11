package com.tydic.datav.service.impl;

import com.tydic.datav.dao.mapper.TSysMenuMapper;
import com.tydic.datav.dao.po.TSysMenu;
import com.tydic.datav.dao.po.TSysMenuExample;
import com.tydic.datav.service.MenuService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单查询
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private TSysMenuMapper menuMapper ;

    @Override
    public List<TSysMenu> queryMenuList() {
        TSysMenuExample example = new TSysMenuExample() ;
        com.tydic.datav.dao.po.TSysMenuExample.Criteria criteria =  example.createCriteria() ;
        criteria.andMenuStatusEqualTo("0");
        return menuMapper.selectByExample(example);
    }
}
