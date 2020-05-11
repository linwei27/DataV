package com.tydic.datav.service;

import java.util.List;

import com.tydic.datav.dao.po.TSysMenu;

/**
 * 菜单
 */
public interface MenuService {
    /**
     * 查询所有的菜单
     * @return
     */
    List<TSysMenu> queryMenuList();
}
