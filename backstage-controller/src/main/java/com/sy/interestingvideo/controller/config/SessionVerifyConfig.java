package com.sy.interestingvideo.controller.config;

import com.sy.interestingvideo.controller.interceptor.SessionVerifyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description:
 * @className:SessionVerifyConfig
 * @author: Clrvn
 * @date: 2019-04-20 16:40
 */
@SuppressWarnings("all")
@Configuration
public class SessionVerifyConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SessionVerifyInterceptor()).addPathPatterns("/**");
	}
	
}
