package com.sy.interestingvideo.controller.config;

import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class BeansConfig {

	/**
	 * 
	 * @title: quartzProperties
	 * @description: 配置Quartz属性文件
	 * @return
	 * @throws IOException
	 *//*
	@Bean
	public Properties quartzProperties() throws IOException {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
		// 在quartz.properties中的属性被读取并注入后再初始化对象
		propertiesFactoryBean.afterPropertiesSet();
		return propertiesFactoryBean.getObject();
	}*/

	/**
	 * 
	 * @title: jobAutowireFactoryBean
	 * @description: 自定义QuartzJob中能植入springbean的工厂类
	 * @return
	 */
	/*@Bean
	public JobAutowireFactoryBean jobAutowireFactoryBean() {
		return new JobAutowireFactoryBean();
	}
*/
	/**
	 * 
	 * @title: schedulerFactoryBean
	 * @description: Quartz任务调度工厂
	 * @return
	 * @throws IOException
	 */
	/*@Bean
	public SchedulerFactoryBean schedulerFactoryBean() throws IOException {
		SchedulerFactoryBean sfb = new SchedulerFactoryBean();
		sfb.setStartupDelay(10);// 启动后，延时10秒执行调度
		sfb.setQuartzProperties(quartzProperties());// 读取配置文件
		sfb.setJobFactory(jobAutowireFactoryBean());// 支持Autowire
		return sfb;
	}*/
}
