package cn.uc.first.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import cn.uc.first.bean.Users;
import cn.uc.first.dao.UserDao;
import cn.uc.first.dao.impl.UserDaoImpl;


public class UserTest {

	UserDao userDao=new UserDaoImpl();
	
	@Test
	public void getUserById() {
		Users user=userDao.getUserById(1);
		System.out.println(user);
		Assert.assertNotNull(user);
	}
	@Ignore
	@Test
	public void insertUser() {
		Users user=new Users();
		user.setId(2);
		user.setNickname("¶þ¹·×Ó");
		user.setUsername("¹·µ°");
		user.setPassword("1234");
		user.setPhone("1111");
		boolean result =userDao.insertUser(user);
		System.out.println(result);
		Assert.assertEquals(true, result);
	}
	@Ignore
	@Test
	public void updateUser(){
		
		Users user=userDao.getUserById(2);
		user.setPassword("2234");
		boolean result =userDao.updateUser(user);
		Assert.assertEquals(true, result);
	}
	@Ignore
	@Test
	public void deleteUser(){
		boolean result=userDao.deleteUser(3);
		Assert.assertEquals(true, result);
	}
}






