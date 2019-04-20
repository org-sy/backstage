package com.sy.interestingvideo.controller.action;

import com.sy.interestingvideo.common.bean.AdminUser;
import lombok.extern.slf4j.Slf4j;
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
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(String username, String password, HttpSession session) {
		
		String token = UUID.randomUUID().toString();
		
		if ((username == "admin" && password == "123qwe") || (username == "root" && password == "root") || (username == "clrvn" && password == "vision")) {
			AdminUser admin = new AdminUser();
			admin.setUsername(username);
			admin.setToken(token);
			admin.setPassword(password);
			
			session.setAttribute("ADMIN", admin);
			return "../center";
		} else {
			log.error("登录失败！username:{}, password:{}, token:{}", username, password, token);
			
			return "/login";
		}
		
	}
}
