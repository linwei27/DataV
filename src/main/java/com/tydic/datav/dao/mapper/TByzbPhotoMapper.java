package com.tydic.datav.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.tydic.datav.dao.po.TByzbPhoto;
import com.tydic.datav.dao.po.TByzbPhotoExample;

public interface TByzbPhotoMapper {
	int countByExample(TByzbPhotoExample example);

    int deleteByExample(TByzbPhotoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TByzbPhoto record);

    int insertSelective(TByzbPhoto record);

    List<TByzbPhoto> selectByExampleWithRowbounds(TByzbPhotoExample example, RowBounds rowBounds);

    List<TByzbPhoto> selectByExample(TByzbPhotoExample example);

    TByzbPhoto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TByzbPhoto record, @Param("example") TByzbPhotoExample example);

    int updateByExample(@Param("record") TByzbPhoto record, @Param("example") TByzbPhotoExample example);

    int updateByPrimaryKeySelective(TByzbPhoto record);

    int updateByPrimaryKey(TByzbPhoto record);
}
