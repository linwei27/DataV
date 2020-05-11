package com.tydic.datav.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.tydic.datav.dao.po.TAjxx;
import com.tydic.datav.dao.po.TAjxxExample;

public interface TAjxxMapper {

	int countByExample(TAjxxExample example);

    int deleteByExample(TAjxxExample example);

    int deleteByPrimaryKey(String id);

    int insert(TAjxx record);
    
    int insert_ajxx_main(String sjc);

    int insertSelective(TAjxx record);

    List<TAjxx> selectByExampleWithRowbounds(TAjxxExample example, RowBounds rowBounds);

    List<TAjxx> selectByExample(TAjxxExample example);
    
    List<TAjxx> selectByExample2(TAjxxExample example);
    
    int deleteById(String id);

    TAjxx selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TAjxx record, @Param("example") TAjxxExample example);

    int updateByExample(@Param("record") TAjxx record, @Param("example") TAjxxExample example);

    int updateByPrimaryKeySelective(TAjxx record);

    int updateByPrimaryKey(TAjxx record);
}
