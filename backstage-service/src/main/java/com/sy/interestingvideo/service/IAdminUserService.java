package com.sy.interestingvideo.service;

import com.sy.interestingvideo.entity.AdminUser;

/**
 * @description:
 * @className:IAdminUserService
 * @author: Clrvn
 * @date: 2019-04-21 17:15
 */
@SuppressWarnings("all")
public interface IAdminUserService {
	
	AdminUser login(String acccount, String password);
}
