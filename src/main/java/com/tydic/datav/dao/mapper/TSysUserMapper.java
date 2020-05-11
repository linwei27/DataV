package com.tydic.datav.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.tydic.datav.dao.po.TSysUser;
import com.tydic.datav.dao.po.TSysUserExample;

public interface TSysUserMapper {
    int countByExample(TSysUserExample example);

    int deleteByExample(TSysUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    List<TSysUser> selectByExampleWithRowbounds(TSysUserExample example, RowBounds rowBounds);

    List<TSysUser> selectByExample(TSysUserExample example);

    TSysUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") TSysUser record, @Param("example") TSysUserExample example);

    int updateByExample(@Param("record") TSysUser record, @Param("example") TSysUserExample example);

    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);
}