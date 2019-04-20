package com.sy.interestingvideo.controller.config;

import com.sy.interestingvideo.controller.interceptor.SessionVerifyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @className:SessionVerifyConfig
 * @author: Clrvn
 * @date: 2019-04-20 16:40
 */
@SuppressWarnings("all")
@Configuration
public class SessionVerifyConfig implements WebMvcConfigurer {
	
	@Autowired
	private SessionVerifyInterceptor sessionVerifyInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(sessionVerifyInterceptor).addPathPatterns("/**").excludePathPatterns("/users/login");
	}
	
}
