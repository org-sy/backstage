package com.sy.interestingvideo.controller.action;

import com.sy.interestingvideo.entity.AdminUser;
import com.sy.interestingvideo.service.impl.AdminUserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @description:
 * @className:UsersAction
 * @author: Clrvn
 * @date: 2019-04-20 21:18
 */
@SuppressWarnings("all")
@Controller
@RequestMapping("users")
@Slf4j
public class UsersAction {
	
	@Autowired
	private AdminUserServiceImpl adminUserService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(String account, String password, HttpSession session) {
		
		String token = UUID.randomUUID().toString();
		
		AdminUser admin = adminUserService.login(account, password);
		
		if (null != admin) {
			admin.setToken(token);
			session.setAttribute("ADMIN", admin);
			return "../center";
		} else {
			log.error("登录失败！account:{}, password:{}, token:{}", account, password, token);
			
			return "/login";
		}
		
	}
}
