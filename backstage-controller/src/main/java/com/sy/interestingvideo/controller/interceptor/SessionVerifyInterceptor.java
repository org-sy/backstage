package com.sy.interestingvideo.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sy.interestingvideo.common.bean.AdminUser;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SessionVerifyInterceptor implements HandlerInterceptor  {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("开始session验证拦截器");
		
		/*Student stu = (Student)request.getSession().getAttribute("STUDENT");*/
		
		AdminUser adminUser = (AdminUser) request.getSession().getAttribute("ADMIN");
		
		System.err.println(request.getRequestURI());
		if (!request.getRequestURI().equals("/users/login") && adminUser == null) {
			response.sendRedirect(request.getContextPath() + "/users/login");
			return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	                       ModelAndView modelAndView) {
		System.out.println("session的Handler调用完毕");
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		System.out.println("session的DispatcherServlet调用完毕");
	}
	
}
