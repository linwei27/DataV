package com.tydic.datav.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.tydic.datav.dao.po.TZxjzyxqk;
import com.tydic.datav.dao.po.TZxjzyxqkExample;

public interface TZxjzyxqkMapper {
	int countByExample(TZxjzyxqkExample example);

    int deleteByExample(TZxjzyxqkExample example);

    int deleteByPrimaryKey(String id);

    int insert(TZxjzyxqk record);

    int insertSelective(TZxjzyxqk record);
    
    int updateStatus();

    List<TZxjzyxqk> selectByExampleWithRowbounds(TZxjzyxqkExample example, RowBounds rowBounds);

    List<TZxjzyxqk> selectByExample(TZxjzyxqkExample example);

    TZxjzyxqk selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TZxjzyxqk record, @Param("example") TZxjzyxqkExample example);

    int updateByExample(@Param("record") TZxjzyxqk record, @Param("example") TZxjzyxqkExample example);

    int updateByPrimaryKeySelective(TZxjzyxqk record);

    int updateByPrimaryKey(TZxjzyxqk record);

}
