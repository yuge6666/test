package com.dao;

import java.util.List;

import org.junit.Test;

import com.dao.impl.StudedntDaoImpl;
import com.entity.Student;

public class StudentDaoTest {
	@Test
	public void testGetByCondition() {
		StudentDAO dao=new StudedntDaoImpl();
		Student stu=new Student();
//		stu.setStuName("≥¬Í∆”‡");
//		stu.setStuAge(16);
		stu.setStuSex("≈Æ");
		List<Student> stuList=dao.getByCondition(stu);
		for (Student student : stuList) {
			System.out.println(student);
		}
		
		
	}
}
