package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Student;

public interface StudentDAO {
	public List<Student> getByCondition(@Param("stu")Student stu);
}
