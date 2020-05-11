package com.tydic.datav.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.tydic.datav.dao.po.TSysMenu;
import com.tydic.datav.dao.po.TSysMenuExample;

public interface TSysMenuMapper {
    int countByExample(TSysMenuExample example);

    int deleteByExample(TSysMenuExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(TSysMenu record);

    int insertSelective(TSysMenu record);

    List<TSysMenu> selectByExampleWithRowbounds(TSysMenuExample example, RowBounds rowBounds);

    List<TSysMenu> selectByExample(TSysMenuExample example);

    TSysMenu selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") TSysMenu record, @Param("example") TSysMenuExample example);

    int updateByExample(@Param("record") TSysMenu record, @Param("example") TSysMenuExample example);

    int updateByPrimaryKeySelective(TSysMenu record);

    int updateByPrimaryKey(TSysMenu record);
}