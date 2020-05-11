package com.tydic.datav.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.tydic.datav.dao.po.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.Map;

public interface ZdryService {

    /**
     * 统计
     * @return
     */
    Map<String,String> queryCount();
    
    
    /**
     * 合成作战
     * @param hczz
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageInfo<THczz> queryHczzList(THczz hczz, Integer pageIndex, Integer pageSize);
    
    /**
     * 案件信息 && 立案信息
     * @param ajxx
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageInfo<TAjxx> queryAjxxList(TAjxx ajxx, Integer pageIndex, Integer pageSize);

    /**
     * 破案信息
     * @param ajxx
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageInfo<TAjxx> queryAjxxList2(TAjxx ajxx, Integer pageIndex, Integer pageSize);
    
    /**
     * 中心九组运行情况&单元战况
     * @param test
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageInfo<TZxjzyxqk> queryZxjzyxqkList(TZxjzyxqk test, Integer pageIndex, Integer pageSize);
    
   

    /**
     * 值班民警排版计划
     * @param zbmjpbjh
     * @return
     */
    PageInfo<TZbmjpbjh> queryZbmjpbjhList(TZbmjpbjh zbmjpbjh, Integer pageIndex, Integer pageSize);

   

    /**
     * 核查人员照片 &&未成年人照片
     * @param hcryPhoto
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageInfo<THcryPhoto> hcryPhotoList(THcryPhoto hcryPhoto, Integer pageIndex, Integer pageSize);
    
    /**
     * 便衣抓捕照片  && 抓获人员照片
     * @param byzbPhoto
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageInfo<TByzbPhoto> byzbPhotoList(TByzbPhoto byzbPhoto, Integer pageIndex, Integer pageSize);
    
    /**
     * 文件上传
     * @param type 1:重点人口 2:未成年人员犯罪 3:值班民警（合成） 4:追回物品（成果） 5:抓捕人员信息
     * @return
     */
    JSONObject uploadFile(String type, HttpServletRequest request);


    /**
     * 上传文件夹
     * @return
     */
    JSONObject uploadFolder(HttpServletRequest request, HttpSession session);
}
