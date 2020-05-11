package com.tydic.datav.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.tydic.datav.dao.po.THczz;
import com.tydic.datav.dao.po.THczzExample;

public interface THczzMapper {
	int countByExample(THczzExample example);

    int deleteByExample(THczzExample example);

    int deleteByPrimaryKey(String id);

    int insert(THczz record);

    int insertSelective(THczz record);
    
    int updateStatus();

    List<THczz> selectByExampleWithRowbounds(THczzExample example, RowBounds rowBounds);

    List<THczz> selectByExample(THczzExample example);

    THczz selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") THczz record, @Param("example") THczzExample example);

    int updateByExample(@Param("record") THczz record, @Param("example") THczzExample example);

    int updateByPrimaryKeySelective(THczz record);

    int updateByPrimaryKey(THczz record);

}
