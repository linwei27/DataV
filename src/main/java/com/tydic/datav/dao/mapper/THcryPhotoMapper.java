package com.tydic.datav.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.tydic.datav.dao.po.THcryPhoto;
import com.tydic.datav.dao.po.THcryPhotoExample;


public interface THcryPhotoMapper {
	int countByExample(THcryPhotoExample example);

    int deleteByExample(THcryPhotoExample example);

    int deleteByPrimaryKey(String id);

    int insert(THcryPhoto record);

    int insertSelective(THcryPhoto record);

    List<THcryPhoto> selectByExampleWithRowbounds(THcryPhotoExample example, RowBounds rowBounds);

    List<THcryPhoto> selectByExample(THcryPhotoExample example);

    THcryPhoto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") THcryPhoto record, @Param("example") THcryPhotoExample example);

    int updateByExample(@Param("record") THcryPhoto record, @Param("example") THcryPhotoExample example);

    int updateByPrimaryKeySelective(THcryPhoto record);

    int updateByPrimaryKey(THcryPhoto record);
}
