package com.sy.interestingvideo.service.impl;

import com.sy.interestingvideo.entity.AdminUser;
import com.sy.interestingvideo.repository.IAdminUserRepository;
import com.sy.interestingvideo.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @className:AdminUserServiceImpl
 * @author: Clrvn
 * @date: 2019-04-21 17:17
 */
@SuppressWarnings("all")
@Service
public class AdminUserServiceImpl implements IAdminUserService {
	
	@Autowired
	private IAdminUserRepository adminUserRepository;
	
	@Override
	public AdminUser login(String account, String password) {
		List<AdminUser> tempList = adminUserRepository.findByAccountAndPassword(account, password);
		return tempList.size() > 0 ? tempList.get(0) : null;
	}
}
