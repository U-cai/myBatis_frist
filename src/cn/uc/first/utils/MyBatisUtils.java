package cn.uc.first.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	//����ģʽ
	static SqlSessionFactory factory =null;
	static String config="config.xml";
	
	//��ȡӦ��Ψһ��factory����
	private	static SqlSessionFactory factory(){
		if (factory==null) {		
				InputStream is=MyBatisUtils.class.getClassLoader().getResourceAsStream(config);
				factory =new SqlSessionFactoryBuilder().build(is);
		}
		return factory;
	}
	
	//ʹ��Ӧ��Ψһ��factory�����һ��sqlsession����
	public static SqlSession openSession(){
		return factory().openSession();
	}
}