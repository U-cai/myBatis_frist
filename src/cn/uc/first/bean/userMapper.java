package cn.uc.first.bean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface userMapper {

	@Select("select * from users")
	List<Users> getAllUsers();
	
	@Select("select * from users where id=#{id}")
	Users getUserById(int userid);
	
	@Insert("insert into useers(nickname,username,password,phone)values(#{nickname},#{name},#{password},#{phone})")
	boolean insertUser(Users user);
	
	@Update("update users setnickname=#{nickname},#{name},#{password},#{phone}")
	boolean updateUser(Users user);
	
	@Delete("delete from users where id=#{id}")
	boolean deleteUser(int userid);
}
