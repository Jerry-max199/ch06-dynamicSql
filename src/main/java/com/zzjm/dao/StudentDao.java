package com.zzjm.dao;

import com.zzjm.domain.Student;

import java.util.List;

public interface StudentDao {

    List<Student> selectStudentIf(Student student);
    List<Student> selectStudentWhere(Student student);
    List<Student> selectStudentForeach(List<Student> id);
    List<Student> selectStudentAll();
}
