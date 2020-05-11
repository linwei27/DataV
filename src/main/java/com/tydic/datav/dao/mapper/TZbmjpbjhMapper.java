package com.tydic.datav.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.tydic.datav.dao.po.TZbmjpbjh;
import com.tydic.datav.dao.po.TZbmjpbjhExample;

public interface TZbmjpbjhMapper {
    int countByExample(TZbmjpbjhExample example);

    int deleteByExample(TZbmjpbjhExample example);

    int deleteByPrimaryKey(String id);
    
    void deletebysj(String sj);
    
    void updateStatus();   //更新标志位

    int insert(TZbmjpbjh record);

    int insertSelective(TZbmjpbjh record);

    List<TZbmjpbjh> selectByExampleWithRowbounds(TZbmjpbjhExample example, RowBounds rowBounds);

    List<TZbmjpbjh> selectByExample(TZbmjpbjhExample example);

    TZbmjpbjh selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TZbmjpbjh record, @Param("example") TZbmjpbjhExample example);

    int updateByExample(@Param("record") TZbmjpbjh record, @Param("example") TZbmjpbjhExample example);

    int updateByPrimaryKeySelective(TZbmjpbjh record);

    int updateByPrimaryKey(TZbmjpbjh record);
}