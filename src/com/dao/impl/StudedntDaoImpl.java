package com.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.BaseDAO;
import com.dao.StudentDAO;
import com.entity.Student;

public class StudedntDaoImpl implements StudentDAO{

	@Override
	public List<Student> getByCondition(Student stu) {
		SqlSession session=BaseDAO.getSession();
		StudentDAO dao=session.getMapper(StudentDAO.class);
		List<Student> stulist=dao.getByCondition(stu);
		session.close();
		return stulist;
	}

}
