package cn.uc.first.dao;

import java.util.List;

import cn.uc.first.bean.Users;

public interface UserDao {
	
	//获取所有他、用户
	List<Users> getAllUsers();
	
	Users getUserById(int userid);
	
	boolean insertUser(Users user);
	
	boolean updateUser(Users user);
	
	boolean deleteUser(int userid);
}
