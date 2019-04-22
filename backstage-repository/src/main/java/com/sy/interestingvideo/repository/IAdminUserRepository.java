package com.sy.interestingvideo.repository;

import com.sy.interestingvideo.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @className:IAdminUser
 * @author: Clrvn
 * @date: 2019-04-21 17:14
 */
@SuppressWarnings("all")
@Repository
public interface IAdminUserRepository extends JpaRepository<AdminUser, Long> {
	
	List<AdminUser> findByAccountAndPassword(String account, String password);
}
