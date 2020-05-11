package com.tydic.datav.contorller;

import com.tydic.datav.dao.po.TSysUser;
import com.tydic.datav.service.LoginService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户登陆
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "login", method = {RequestMethod.GET,RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String login(TSysUser user, HttpServletRequest request) {
       String redirect = "login/login";
        if(StringUtils.isBlank(user.getLoginName()) || StringUtils.isBlank(user.getLoginPwd())){
            return redirect ;
        }
        TSysUser sysUser = loginService.userLogin(user.getLoginName(),user.getLoginPwd());
        if(null == sysUser){
            return redirect ;
        }
        //保存用户session
        request.getSession().setAttribute("user",sysUser);
        redirect = "redirect:/home/main.do";
        return redirect;
    }


    /**
     * 退出登陆
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String out(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/login/login";

    }

}
