package cn.uc.first.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import cn.uc.first.bean.Users;
import cn.uc.first.dao.UserDao;
import cn.uc.first.utils.MyBatisUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public List<Users> getAllUsers() {
		// ִ��xmlӳ���ļ�����ľ����sql
		SqlSession session=null;
		try {
			session=MyBatisUtils.openSession();//����sqlִ�лỰSqlSession����
			String statement="cn.uc.first.bean.userMapper.selectAll";
			List<Users> usersList = session.selectList(statement);//ִ�в�ѯ���
			return usersList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (session!=null) {
				session.close();
			}
		}
		return null;
	}

	/*public static void main(String[] args) {
		List<Users> userList=new UserDaoImpl().getAllUsers();
		Iterator<Users> itUser=userList.iterator();
		while (itUser.hasNext()) {
			System.out.println(itUser.next());
		}
	}*/

	@Override
	public Users getUserById(int userid) {
		SqlSession session=MyBatisUtils.openSession();
		String statement="cn.uc.first.bean.userMapper.selectById";
		Users user=session.selectOne(statement,userid);
		session.close();
		return user;
	}

	@Override
	public boolean insertUser(Users user) {
		SqlSession session=MyBatisUtils.openSession();
		String statement="cn.uc.first.bean.userMapper.insert";
		int row=session.insert(statement,user);
		session.commit();//�ύ���
		session.close();
		if (row>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(Users user) {
		SqlSession session=MyBatisUtils.openSession();
		String statement="cn.uc.first.bean.userMapper.update";
		int row=session.update(statement,user);
		session.commit();//�ύ���
		session.close();
		if (row>0) {
			return true;
		}
		return false;
	}
	

	@Override
	public boolean deleteUser(int userid) {
		SqlSession session=MyBatisUtils.openSession();
		String statement="cn.uc.first.bean.userMapper.delete";
		int row=session.delete(statement,userid);
		session.commit();//�ύ���
		session.close();
		if (row>0) {
			return true;
		}
		return false;
	}
	
	
}
