package com.tydic.datav.contorller;

import com.tydic.datav.dao.po.TSysMenu;
import com.tydic.datav.service.MenuService;
import com.tydic.datav.service.ZdryService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Title: HomeController
 * Description: 主页 Controller
 * Copyright: Copyright (c) 2015
 * @author liqh
 * @version 1.0
 *
 */
@Controller
public class HomeController{
	
	private final static Logger log = Logger.getLogger(HomeController.class);
	
	@Autowired
	private MenuService menuService;

	@Autowired
	private ZdryService zdryService;


	/**
	 * 主页展示
	 * @author liqh
	 * @version 1.0
	 */
	@RequestMapping("/home/main") 
	public String main(HttpServletRequest request, HttpServletResponse response){
		List<TSysMenu>  menuList =  menuService.queryMenuList();
		request.setAttribute("resultList",menuList);
		return "home/index";
	}
	


	/**
	 * 菜单right
	 * @author liqh
	 * @version 1.0
	 * @createtime 2015-8-21  下午2:26:51
	 */
	@RequestMapping("/home/right")
	public String right(HttpServletRequest request, HttpServletResponse response){
		request.setAttribute("item",zdryService.queryCount());
		return "home/right";
	}
	
	






}
