package com.tydic.datav.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tydic.datav.dao.mapper.*;
import com.tydic.datav.dao.po.*;
import com.tydic.datav.service.ZdryService;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ZdryServiceImpl implements ZdryService {
	@Resource
	private TZbmjpbjhMapper zbmjpbjhMapper;
	@Resource
	private TZxjzyxqkMapper zxjzyxqkMapper;
	@Resource
	private THcryPhotoMapper hcryPhotoMapper;
	@Resource
	private TByzbPhotoMapper byzbPhotoMapper;
	@Resource
	private TAjxxMapper ajxxMapper;
	@Resource
	private THczzMapper hczzMapper;

	@Value("${file.upload.dic}")
	private String fileUploadDic;

	/**
	 * @return
	 */
	@Override
	public Map<String, String> queryCount() {
		Map<String, String> result = new HashMap<>();
		result.put("zbmjpbjh", zbmjpbjhMapper.countByExample(new TZbmjpbjhExample()) + "");
		result.put("zxjzyxqk", zxjzyxqkMapper.countByExample(new TZxjzyxqkExample()) + "");
		result.put("hcryPhoto", hcryPhotoMapper.countByExample(new THcryPhotoExample()) + "");
		result.put("byzbPhoto", byzbPhotoMapper.countByExample(new TByzbPhotoExample()) + "");
		result.put("ajxx", ajxxMapper.countByExample(new TAjxxExample()) + "");
		result.put("hczz", hczzMapper.countByExample(new THczzExample()) + "");
		return result;
	}
	
	

	/**
	 * 合成作战
	 */
	@Override
	public PageInfo<THczz> queryHczzList(THczz hczz, Integer pageIndex, Integer pageSize) {
		THczzExample example = initHczzExample(hczz);
		PageHelper.startPage(pageIndex, pageSize);
		List<THczz> queryList = hczzMapper.selectByExample(example);
		PageInfo<THczz> pageInfo = new PageInfo<>(queryList);
		return pageInfo;
	}

	/**
	 * 案件信息 && 立案信息
	 */
	@Override
	public PageInfo<TAjxx> queryAjxxList(TAjxx test, Integer pageIndex, Integer pageSize) {
		TAjxxExample example = initAjxxExample(test);
		PageHelper.startPage(pageIndex, pageSize);
		List<TAjxx> queryList = ajxxMapper.selectByExample(example);
		PageInfo<TAjxx> pageInfo = new PageInfo<>(queryList);
		return pageInfo;

	}
	
	/**
	 * 破案信息
	 */
	@Override
	public PageInfo<TAjxx> queryAjxxList2(TAjxx test, Integer pageIndex, Integer pageSize) {
		TAjxxExample example = initAjxxExample(test);
		PageHelper.startPage(pageIndex, pageSize);
		List<TAjxx> queryList = ajxxMapper.selectByExample2(example);
		PageInfo<TAjxx> pageInfo = new PageInfo<>(queryList);
		return pageInfo;
	}

	/**
	 * 中心九组运行情况 &&单元战况
	 */
	@Override
	public PageInfo<TZxjzyxqk> queryZxjzyxqkList(TZxjzyxqk test, Integer pageIndex, Integer pageSize) {
		TZxjzyxqkExample example = initTZxjzyxqkExample(test);
		PageHelper.startPage(pageIndex, pageSize);
		List<TZxjzyxqk> queryList = zxjzyxqkMapper.selectByExample(example);
		PageInfo<TZxjzyxqk> pageInfo = new PageInfo<>(queryList);
		return pageInfo;
	}

	/**
	 * 值班民警排版计划
	 */
	@Override
	public PageInfo<TZbmjpbjh> queryZbmjpbjhList(TZbmjpbjh zbmjpbjh, Integer pageIndex, Integer pageSize) {
		TZbmjpbjhExample example = initTZbmjpbjhExample(zbmjpbjh);
		PageHelper.startPage(pageIndex, pageSize);
		List<TZbmjpbjh> queryList = zbmjpbjhMapper.selectByExample(example);
		PageInfo<TZbmjpbjh> pageInfo = new PageInfo<>(queryList);
		return pageInfo;
	}

	/**
	 * 便衣抓捕照片&&未成年人犯罪
	 */
	@Override
	public PageInfo<TByzbPhoto> byzbPhotoList(TByzbPhoto byzbPhoto, Integer pageIndex, Integer pageSize) {
		TByzbPhotoExample example = new TByzbPhotoExample();
		TByzbPhotoExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(byzbPhoto.getSfzh())) {
			criteria.andSfzhLike("%" + byzbPhoto.getSfzh() + "%");
		}
		PageHelper.startPage(pageIndex, pageSize);
		List<TByzbPhoto> queryList = byzbPhotoMapper.selectByExample(example);
		PageInfo<TByzbPhoto> pageInfo = new PageInfo<>(queryList);
		return pageInfo;
	}

	/**
	 * 核查人员照片&&抓获人员照片
	 */
	@Override
	public PageInfo<THcryPhoto> hcryPhotoList(THcryPhoto hcryPhoto, Integer pageIndex, Integer pageSize) {
		THcryPhotoExample example = new THcryPhotoExample();
		THcryPhotoExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(hcryPhoto.getSfzh())) {
			criteria.andSfzhLike("%" + hcryPhoto.getSfzh() + "%");
		}
		PageHelper.startPage(pageIndex, pageSize);
		List<THcryPhoto> queryList = hcryPhotoMapper.selectByExample(example);
		PageInfo<THcryPhoto> pageInfo = new PageInfo<>(queryList);
		return pageInfo;
	}

	/**
	 * 文件上传
	 *
	 * @param type 1:重点人口 2:未成年人员犯罪 3:值班民警（合成） 4:追回物品（成果） 5:抓捕人员信息
	 * @return
	 */
	@Override
	public JSONObject uploadFile(String type, HttpServletRequest request) {
		JSONObject result = new JSONObject();
		result.put("status", "0");
		result.put("msg", "请选择要上产的文件！");

		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 判断 request 是否有文件上传,即多部分请求
		if (multipartResolver.isMultipart(request)) {
			// 转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 取得request中的所有文件名
			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				// 取得上传文件
				MultipartFile file = multiRequest.getFile(iter.next());

				if (null == file) {
					return result;
				}
				try {
					uploadExcel(request, file, type, result);
				} catch (Exception e) {
					result.put("msg", "文件上传失败,原因：" + e.getMessage());
					e.printStackTrace();
				}
			}
		}

		result.put("status", "1");
		result.put("msg", "上传成功");
		return result;
	}

	/**
	 * 文件夹上传
	 *
	 * @param request
	 * @return
	 */
	@Override
	public JSONObject uploadFolder(HttpServletRequest request, HttpSession session) {
		String type = (String) session.getAttribute("type");
		JSONObject result = new JSONObject();
		result.put("status", "0");
		result.put("msg", "请选择要上传的文件！");
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 判断 request 是否有文件上传,即多部分请求
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest params = ((MultipartHttpServletRequest) request);
			List<MultipartFile> folder = params.getFiles("folder");
			if (null == folder || folder.size() < 1) {
				result.put("msg", "请选择文件夹！");
				return result;
			}
			for (MultipartFile file : folder) {
				try {

					String fileName = System.currentTimeMillis() + file.getOriginalFilename();

					String fileName1 = fileName.substring(fileName.lastIndexOf('/') + 1); // 身份证号

					String sfzh = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("/") + 1,
							file.getOriginalFilename().lastIndexOf("."));

//					 String destFileName = System.getProperty("user.dir") + File.separator +
//					 "uploaded" + File.separator + "wcnrfz";

					String destFileName = fileUploadDic + File.separator + "uploaded" + File.separator + "wcrnfz"
							+ File.separator + fileName1;
					if ("14".equals(type)) {
						destFileName = fileUploadDic + File.separator + "uploaded" + File.separator + "zhry"
								+ File.separator + fileName1;
					}

					File destFile = new File(destFileName);

					if (!destFile.getParentFile().exists()) {
						destFile.getParentFile().mkdirs();
					}

					// 把浏览器上传的文件复制到希望的位置
					file.transferTo(destFile);
					if (type.equals("13")) {
						THcryPhoto hcryPhoto = new THcryPhoto();
						String id = UUID.randomUUID().toString().replaceAll("-", "");
						hcryPhoto.setId(id);
						hcryPhoto.setSfzh(sfzh);
						hcryPhoto.setFileName(fileName1); // file.getOriginalFilename()
						hcryPhoto.setDestFileName(fileName);
						hcryPhoto.setDestFilePath(destFileName);
						hcryPhotoMapper.insert(hcryPhoto);
					} else if (type.equals("14")) {
						TByzbPhoto byzbPhoto = new TByzbPhoto();
						String id = UUID.randomUUID().toString().replaceAll("-", "");
						byzbPhoto.setId(id);
						byzbPhoto.setSfzh(sfzh);
						byzbPhoto.setFileName(fileName1); // file.getOriginalFilename()
						byzbPhoto.setDestFileName(fileName);
						byzbPhoto.setDestFilePath(destFileName);
						byzbPhotoMapper.insert(byzbPhoto);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			result.put("status", "1");
			result.put("msg", "上传成功！");

		}
		return result;
	}

	/**
	 * 上传文件
	 *
	 * @param multipartFile
	 * @param type
	 * @param jsonObject
	 * @return
	 */
	private JSONObject uploadExcel(HttpServletRequest request, MultipartFile multipartFile, String type,
			JSONObject jsonObject) throws IOException {
		// 时间戳
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String sjc = df.format(new Date());

		String fileName = multipartFile.getOriginalFilename();
		if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
			jsonObject.put("msg", "上传文件格式错误，请上传后缀为.xls或.xlsx的文件");
			return jsonObject;
		}
		InputStream is = multipartFile.getInputStream();
		Workbook hssfWorkbook = null;
		if (fileName.endsWith("xlsx")) {
			hssfWorkbook = new XSSFWorkbook(is); // Excel 2007
		} else if (fileName.endsWith("xls")) {
			hssfWorkbook = new HSSFWorkbook(is); // Excel 2003
		}
		// 插入之前更新状态
		if (type.equals("7")) {
			zxjzyxqkMapper.updateStatus();
		} else if (type.equals("1")) {
			hczzMapper.updateStatus();
		} else if (type.equals("15")) {
			ajxxMapper.deleteById("1");  //导入之前删除之前的数据，数据都是在main表里取
		} else if (type.equals("2")) {
			ajxxMapper.deleteById("2");
		} else if (type.equals("3")) {  //值班民警排班计划
			//插入之前将标志位 置为0
			zbmjpbjhMapper.updateStatus();
		}

		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			Sheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (null == hssfSheet) {
				continue;
			}
			// 循环行Row
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				Row row = hssfSheet.getRow(rowNum);
	
				if (null == row) {
					continue;
				}
				try {
					//增加一个参数作为ord自增的值，这里选择行号
					savaData(type, row, sjc, rowNum);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		//ajxxMapper.insert_ajxx_main(sjc);
		return jsonObject;
	}

	/**
	 * 中心九组运行情况 &&单元战况
	 *
	 * @param zxjzyxqk
	 * @return
	 */
	private TZxjzyxqkExample initTZxjzyxqkExample(TZxjzyxqk zxjzyxqk) {
		TZxjzyxqkExample example = new TZxjzyxqkExample();
		TZxjzyxqkExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(zxjzyxqk.getDw())) {
			criteria.andDwLike("%" + zxjzyxqk.getDw().trim() + "%");
		}
		/*
		 * if (StringUtils.isNotBlank(zxjzyxqk.getJjs())) {
		 * criteria.andJjsLike("%"+zxjzyxqk.getJjs().trim() + "%"); } if
		 * (StringUtils.isNotBlank(zxjzyxqk.getXsajs())) {
		 * criteria.andXsajsLike("%"+zxjzyxqk.getXsajs().trim() + "%"); } if
		 * (StringUtils.isNotBlank(zxjzyxqk.getZaajs())) {
		 * criteria.andZaajsLike("%"+zxjzyxqk.getZaajs().trim() + "%"); } if
		 * (StringUtils.isNotBlank(zxjzyxqk.getZbs())) {
		 * criteria.andZbsLike("%"+zxjzyxqk.getZbs().trim() + "%"); } if
		 * (StringUtils.isNotBlank(zxjzyxqk.getZzs())) {
		 * criteria.andZzsLike("%"+zxjzyxqk.getZzs().trim() + "%"); }
		 */
		return example;
	}
	
	

	/**
	 * 案件信息
	 * 
	 * @param ajxx
	 * @return
	 */
	private TAjxxExample initAjxxExample(TAjxx ajxx) {
		TAjxxExample example = new TAjxxExample();
		TAjxxExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(ajxx.getAjbh())) {
			criteria.andAjbhLike("%" + ajxx.getAjbh().trim() + "%");
		}
		return example;
	}

	/**
	 * 合成作战
	 * 
	 * @param hczz
	 * @return
	 */
	private THczzExample initHczzExample(THczz hczz) {
		THczzExample example = new THczzExample();
		THczzExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(hczz.getMc())) {
			criteria.andMcLike("%" + hczz.getMc().trim() + "%");
		}
		return example;
	}

	/**
	 * 值班民警排版计划
	 */
	private TZbmjpbjhExample initTZbmjpbjhExample(TZbmjpbjh zbmjpbjh) {
		TZbmjpbjhExample example = new TZbmjpbjhExample();
		TZbmjpbjhExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(zbmjpbjh.getSj())) {
			criteria.andSjLike("%" + zbmjpbjh.getSj().trim() + "%");
		}
		return example;
	}

	/**
	 * 初始化Cell值
	 *
	 * @param hssfCell
	 * @return
	 */
	private static String getValue(Cell hssfCell) {
		if (hssfCell != null) {
			if (hssfCell.getCellType() == hssfCell.CELL_TYPE_STRING) {
				return String.valueOf(hssfCell.getStringCellValue());
			} else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
				return String.valueOf(hssfCell.getNumericCellValue());
			} else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
				return String.valueOf(hssfCell.getBooleanCellValue());
			} else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_FORMULA) {
				return String.valueOf(hssfCell.getCellFormula());
			} else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BLANK) {
				return String.valueOf(hssfCell.getStringCellValue());
			}
		}
		return "";
	}
	
	/**
	 * 
	 * 将表格数据转换为字符串
	 * @param cel
	 * @return
	 */
	private static String ConvertMyCell(Cell cel)
	{
		
		double s = cel.getNumericCellValue();
		BigDecimal db = new BigDecimal(s);
		return db.toPlainString();
	}

	//字符串转大数
	private static String ConvertCellByString(String str)
	{
		
		BigDecimal db = new BigDecimal(str);
		return  db.toPlainString();
	}
	//设置属性
	private TZbmjpbjh GetZBJH(String mc,String gw,String tel,String rq,Integer ord)
	{
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		TZbmjpbjh zbmjpbjh = new TZbmjpbjh();
		zbmjpbjh.setId(id);			
		zbmjpbjh.setSj(rq);
		zbmjpbjh.setGw(gw);
		zbmjpbjh.setMc(mc);
		zbmjpbjh.setTel(ConvertCellByString(tel));
		zbmjpbjh.setOrd(ord);
		return zbmjpbjh;
	}
	
	/**
	 * 
	 * @param type 类别，区分上传类型
	 * @param row  行，每行的数据
	 * @param sjc  时间戳，区分字段
	 * @param rowNum  行号，作为自增字段的值
	 * @throws ParseException
	 */
	private void savaData(String type, Row row, String sjc, int rowNum) throws ParseException {

		String id = UUID.randomUUID().toString().replaceAll("-", "");
		Cell cell0 = row.getCell(0);
		Cell cell1 = row.getCell(1);
		Cell cell2 = row.getCell(2);

		//3 值班民警排班计划
		if ("3".equals(type)) {
			/**  2019.11.05  更改
			String zbrq = ConvertMyCell(cell0);
			Integer cnt = 1;
			zbmjpbjhMapper.deletebysj(zbrq);
			zbmjpbjhMapper.insert(GetZBJH(getValue(cell1),"中心领导",getValue(cell2),zbrq,cnt++));
			zbmjpbjhMapper.insert(GetZBJH(getValue(row.getCell(3)),"研判民警",getValue(row.getCell(4)),zbrq,cnt++));
			zbmjpbjhMapper.insert(GetZBJH(getValue(row.getCell(5)),"研判辅警",getValue(row.getCell(6)),zbrq,cnt++));	
			zbmjpbjhMapper.insert(GetZBJH(getValue(row.getCell(7)),"综合组",getValue(row.getCell(8)),zbrq,cnt++));
			zbmjpbjhMapper.insert(GetZBJH(getValue(row.getCell(9)),"技术侦查",getValue(row.getCell(10)),zbrq,cnt++));	
			zbmjpbjhMapper.insert(GetZBJH(getValue(row.getCell(11)),"便衣抓捕",getValue(row.getCell(12)),zbrq,cnt++));
			zbmjpbjhMapper.insert(GetZBJH(getValue(row.getCell(13)),"刑事技术",getValue(row.getCell(14)),zbrq,cnt++));	
			*/	
			
			//插入新的数据之前将以前的bz位置为0，此操作已在323行执行
			TZbmjpbjh zbmjpbjh = new TZbmjpbjh();
			zbmjpbjh.setId(id);
			//时间也要转(数字转文本)  如果是文本，就不用转了
			if (cell0.getCellType() == 1) {
				zbmjpbjh.setSj(getValue(cell0));
			} else {
				zbmjpbjh.setSj(ConvertMyCell(cell0));
			}
			zbmjpbjh.setGw(getValue(cell1));
			zbmjpbjh.setMc(getValue(cell2));
			//电话要将数字转文本 如果是文本，就不用转了
			if (row.getCell(3).getCellType() == 1) {
				zbmjpbjh.setTel(getValue(row.getCell(3)));
			} else {
				zbmjpbjh.setTel(ConvertMyCell(row.getCell(3)));
			}
		
			//ord字段，自增
			zbmjpbjh.setOrd(rowNum);
			zbmjpbjhMapper.insert(zbmjpbjh);
		
		} else if ("1".equals(type)) {
			THczz hczz = new THczz();
			hczz.setId(id);
			hczz.setMc(getValue(cell0));
			hczz.setSz(getValue(cell1));
			hczzMapper.insert(hczz);

		} else if ("7".equals(type)) { // 单元战况
			TZxjzyxqk zxjzyxqk = new TZxjzyxqk();
			zxjzyxqk.setId(id);
			zxjzyxqk.setDw(getValue(cell0));
			zxjzyxqk.setYps(getValue(cell1));
			zxjzyxqk.setXsajs(getValue(cell2));
			zxjzyxqk.setZaajs(getValue(row.getCell(3)));
			zxjzyxqk.setXss(getValue(row.getCell(4)));
			zxjzyxqk.setZbs(getValue(row.getCell(5)));
			zxjzyxqk.setPas(getValue(row.getCell(6)));
			zxjzyxqkMapper.insert(zxjzyxqk);
		} else if ("15".equals(type) || "2".equals(type)) {
			TAjxx ajxx = new TAjxx();
			if ("15".equals(type)) {
				ajxx.setId("1"); // 立案
			} else if ("2".equals(type)) {
				ajxx.setId("2"); // 破案
			}
			//此处不用处理
			ajxx.setAjbh(getValue(cell0));
			ajxx.setAjmc(getValue(cell1));
			ajxx.setAjlb(getValue(cell2));
			ajxx.setLbml(getValue(row.getCell(3)));
			ajxx.setAjzt(getValue(row.getCell(4)));
			ajxx.setAjztsj(getValue(row.getCell(5)));
			ajxx.setAjfxsj(getValue(row.getCell(6)));
			ajxx.setAjlx(getValue(row.getCell(7)));
			ajxx.setAjxz(getValue(row.getCell(8)));
			ajxx.setFadd(getValue(row.getCell(9)));
			ajxx.setJyaq(getValue(row.getCell(10)));
			ajxx.setFasj(getValue(row.getCell(11)));
			ajxx.setFajssj(getValue(row.getCell(12)));
			ajxx.setFasd(getValue(row.getCell(13)));
			ajxx.setFady(getValue(row.getCell(14)));
			ajxx.setFaxxdz(getValue(row.getCell(15)));
			ajxx.setGjzars(getValue(row.getCell(16)));
			ajxx.setLasj(getValue(row.getCell(17)));
			ajxx.setBarxm(getValue(row.getCell(18)));
			ajxx.setBarxb(getValue(row.getCell(19)));
			ajxx.setBarnl(getValue(row.getCell(20)));
			ajxx.setBarjzdqh(getValue(row.getCell(21)));
			ajxx.setBardh(getValue(row.getCell(22)));
			ajxx.setBarsjjzd(getValue(row.getCell(23)));
			ajxx.setJjbh(getValue(row.getCell(24)));
			ajxx.setJbdw(getValue(row.getCell(25)));
			ajxx.setBcab(getValue(row.getCell(26)));
			ajxx.setCbr(getValue(row.getCell(27)));
			ajxx.setJjsd(getValue(row.getCell(28)));
			ajxx.setJqsq(getValue(row.getCell(29)));
			ajxx.setJssd(getValue(row.getCell(30)));
			ajxx.setJrjzkjfsjsd(getValue(row.getCell(31)));
			ajxx.setJd(getValue(row.getCell(32)));
			ajxx.setWd(getValue(row.getCell(33)));
			ajxx.setMcmysd(getValue(row.getCell(34)));
			ajxx.setQqsd(getValue(row.getCell(35)));
			ajxx.setSbsd(getValue(row.getCell(36)));
			ajxx.setSssd(getValue(row.getCell(37)));
			ajxx.setSssd2(getValue(row.getCell(38)));
			ajxx.setXtkjtpsd(getValue(row.getCell(39)));
			ajxx.setXpsd(getValue(row.getCell(40)));
			ajxx.setXzbw(getValue(row.getCell(41)));
			ajxx.setXzcs(getValue(row.getCell(42)));
			ajxx.setYbsd(getValue(row.getCell(43)));
			ajxx.setZpsd(getValue(row.getCell(44)));
			ajxx.setZagj(getValue(row.getCell(45)));
			ajxx.setZazbsd(getValue(row.getCell(46)));
			ajxx.setQtsd(getValue(row.getCell(47)));
			ajxx.setSajb(getValue(row.getCell(48)));
			ajxx.setSazjz(getValue(row.getCell(49)));
			ajxx.setSszjz(getValue(row.getCell(50)));
			ajxx.setWlzasd(getValue(row.getCell(51)));
			ajxx.setZabs(getValue(row.getCell(52)));
			ajxx.setPcsgx(getValue(row.getCell(53)));
			ajxx.setPadw(getValue(row.getCell(54)));
			ajxx.setParq(getValue(row.getCell(55)));
			ajxx.setJhzjz(getValue(row.getCell(56)));
			ajxx.setSlbm(getValue(row.getCell(57)));
			ajxx.setSlfs(getValue(row.getCell(58)));
			ajxx.setSlr(getValue(row.getCell(59)));
			ajxx.setSlsj(getValue(row.getCell(60)));
			ajxx.setZhryxmsj(getValue(row.getCell(61)));
			ajxx.setXkbh(getValue(row.getCell(62)));
			ajxx.setTbr(getValue(row.getCell(63)));
			ajxx.setLrdw(getValue(row.getCell(64)));
			ajxx.setLrsj(getValue(row.getCell(65)));
			ajxx.setLrfj(getValue(row.getCell(66)));
			ajxx.setSjc(sjc);
			ajxxMapper.insert(ajxx);

		}
	}







	

	

	

}
