package cn.uc.first.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import cn.uc.first.bean.Users;
import cn.uc.first.bean.userMapper;
import cn.uc.first.dao.impl.UserMapperImpl;

public class UserTest1 {

	userMapper um=new UserMapperImpl();
	@Test
	public void getAllUsers(){
		List<Users> users=um.getAllUsers();
		Iterator<Users> itusers=users.iterator();
		while (itusers.hasNext()) {
			System.out.println(itusers.hasNext());
			
		}		
	}
}
