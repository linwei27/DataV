package com.tydic.datav.contorller;

import com.github.pagehelper.PageInfo;
import com.tydic.datav.dao.po.*;
import com.tydic.datav.service.ZdryService;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/zdry/")
public class ZdryController {

	private final static Logger logger = Logger.getLogger(ZdryController.class);

	@Autowired
	private ZdryService zdryService;

	@Value("${file.upload.dic}")
	private String fileUploadDic;
	
	
	

	/**
	 * 案件信息之立案
	 * 
	 * @param request
	 * @param ajxx
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("ajxxList")
	public String ajxxList(HttpServletRequest request, TAjxx ajxx,
			@RequestParam(name = "pageIndex", defaultValue = "1") String pageIndex,
			@RequestParam(name = "pageSize", defaultValue = "8") String pageSize) {
		PageInfo<TAjxx> page = zdryService.queryAjxxList(ajxx, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
		request.setAttribute("page", page);
		request.setAttribute("info", ajxx);
		return "manager/ajxxList";
	}
	
	/**
	 * 破案
	 * @param request
	 * @param ajxx
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("poanList")
	public String poanList(HttpServletRequest request, TAjxx ajxx,
			@RequestParam(name = "pageIndex", defaultValue = "1") String pageIndex,
			@RequestParam(name = "pageSize", defaultValue = "8") String pageSize) {
		PageInfo<TAjxx> page = zdryService.queryAjxxList2(ajxx, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
		request.setAttribute("page", page);
		request.setAttribute("info", ajxx);
		return "manager/poanList";
	}

	/**
	 * 合成作战
	 * 
	 * @param request
	 * @param hczz
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("hczzList")
	public String hczzList(HttpServletRequest request, THczz hczz,
			@RequestParam(name = "pageIndex", defaultValue = "1") String pageIndex,
			@RequestParam(name = "pageSize", defaultValue = "8") String pageSize) {
		PageInfo<THczz> page = zdryService.queryHczzList(hczz, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
		request.setAttribute("page", page);
		request.setAttribute("info", hczz);
		return "manager/hczzList";
	}

	/**
	 * 单元战况
	 * 
	 * @param request
	 * @param zxjzyxqk
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */

	@RequestMapping("zxjzyxqkList")
	public String zxjzyxqkList(HttpServletRequest request, TZxjzyxqk zxjzyxqk,
			@RequestParam(name = "pageIndex", defaultValue = "1") String pageIndex,
			@RequestParam(name = "pageSize", defaultValue = "8") String pageSize) {

		PageInfo<TZxjzyxqk> page = zdryService.queryZxjzyxqkList(zxjzyxqk, Integer.valueOf(pageIndex),
				Integer.valueOf(pageSize));
		request.setAttribute("page", page);
		request.setAttribute("info", zxjzyxqk);
		return "manager/zxjzyxqkList";
	}

	/**
	 * 值班民警排班计划
	 */
	@RequestMapping("zbmjpbjhList")
	public String zbmjpbjhList(HttpServletRequest request, TZbmjpbjh zbmjpbjh,
			@RequestParam(name = "pageIndex", defaultValue = "1") String pageIndex,
			@RequestParam(name = "pageSize", defaultValue = "8") String pageSize) {
		PageInfo<TZbmjpbjh> page = zdryService.queryZbmjpbjhList(zbmjpbjh, Integer.valueOf(pageIndex),
				Integer.valueOf(pageSize));
		request.setAttribute("page", page);
		request.setAttribute("info", zbmjpbjh);
		return "manager/zbmjpbjhList";
	}

	/**
	 * 核查人员照片信息
	 * 
	 * @param request
	 * @param hcryPhoto
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("hcryPhotoList")
	public String hcryPhotoList(HttpServletRequest request, THcryPhoto hcryPhoto,
			@RequestParam(name = "pageIndex", defaultValue = "1") String pageIndex,
			@RequestParam(name = "pageSize", defaultValue = "8") String pageSize) {
		PageInfo<THcryPhoto> page = zdryService.hcryPhotoList(hcryPhoto, Integer.valueOf(pageIndex),
				Integer.valueOf(pageSize));
		request.setAttribute("page", page);
		request.setAttribute("info", hcryPhoto);
		return "manager/hcryPhotoList";
	}

	/**
	 * 便衣抓捕照片
	 * 
	 * @param request
	 * @param byzbPhoto
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */

	@RequestMapping("byzbPhotoList")
	public String byzbPhotoList(HttpServletRequest request, TByzbPhoto byzbPhoto,
			@RequestParam(name = "pageIndex", defaultValue = "1") String pageIndex,
			@RequestParam(name = "pageSize", defaultValue = "8") String pageSize) {
		PageInfo<TByzbPhoto> page = zdryService.byzbPhotoList(byzbPhoto, Integer.valueOf(pageIndex),
				Integer.valueOf(pageSize));
		request.setAttribute("page", page);
		request.setAttribute("info", byzbPhoto);
		return "manager/byzbPhotoList";
	}

	/**
	 * 抓捕人员照片信息
	 */
	@RequestMapping(value = "toUpload", method = RequestMethod.GET)
	public String toUpload(HttpServletRequest request, String type, HttpSession session) {
		String result = "manager/upload";
		if (StringUtils.isNotBlank(type) && "13".equals(type.trim())) {
			result = "manager/uploadFolder";
		} else if (StringUtils.isNotBlank(type) && "14".equals(type.trim())) {
			result = "manager/uploadFolder";
		}

		session.setAttribute("type", type);  //破案为2

		// request.setAttribute("type",type); //request表单提交数据会丢失，改用session
		return result;
	}

	/**
	 * 解析Excle文件
	 *
	 * @param type    1:重点人口 2:未成年人员犯罪 3:值班民警（合成） 4:追回物品（成果） 5:抓捕人员信息
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "uploadFile", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public String uploadFile(@RequestParam("type") String type, HttpServletRequest request) {
		return zdryService.uploadFile(type, request).toJSONString();
	}

	/**
	 * 上传文件夹
	 * 
	 * @return
	 */
	@RequestMapping(value = "/uploadFolder", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public String uploadFolder(HttpServletRequest request, HttpSession session) {

		String type = (String) session.getAttribute("type");

		String result = zdryService.uploadFolder(request, session).toJSONString();
		logger.info("uploadFolder result:{}" + result);

		String result1 = "";
		if (type.equals("13")) {
			result1 = "redirect:/zdry/hcryPhotoList.do";
		} else if (type.equals("14")) {
			result1 = "redirect:/zdry/byzbPhotoList.do";
		}
		return result1;
	}

	/**
	 * 图片展示
	 * 
	 * @param fileName
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "show", method = RequestMethod.GET)
	public void showPhotos(String fileName, HttpServletRequest request, HttpServletResponse response) {
		
		String type = request.getParameter("type");
		String fileName1 = fileName.substring(fileName.lastIndexOf('/') + 1);  //身份证号
		
		String destFileName = fileUploadDic + File.separator + "uploaded" + File.separator +  "wcrnfz" + File.separator + fileName1;
		
		try {
			FileInputStream fis = null;
			OutputStream os = null;
			try {
				
				//fis = new FileInputStream(fileUploadDic + File.separator + "uploaded" + File.separator + fileName);	
				
				if ("14".equals(type)) {
					destFileName = fileUploadDic + File.separator + "uploaded" + File.separator + "zhry" + File.separator + fileName1;
				}
				
				fis = new FileInputStream(destFileName);		
				
				os = response.getOutputStream();
				int count = 0;
				byte[] buffer = new byte[1024 * 8];
				while ((count = fis.read(buffer)) != -1) {
					os.write(buffer, 0, count);
					os.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
