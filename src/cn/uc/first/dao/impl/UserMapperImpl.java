package cn.uc.first.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.first.bean.Users;
import cn.uc.first.bean.userMapper;
import cn.uc.first.utils.MyBatisUtils;

public class UserMapperImpl implements userMapper {

	@Override
	public List<Users> getAllUsers() {
		SqlSession session=MyBatisUtils.openSession();
		userMapper mapper=session.getMapper(userMapper.class);
		List<Users> userList=mapper.getAllUsers();
		return userList;
	}

	@Override
	public Users getUserById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(int userid) {
		// TODO Auto-generated method stub
		return false;
	}

}
