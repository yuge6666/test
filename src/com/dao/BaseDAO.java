package com.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDAO {
	private static SqlSessionFactory sqlSessionFactory;
	private static final String CONFIG_FILE = "mybatis-config.xml";
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(CONFIG_FILE);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
}
