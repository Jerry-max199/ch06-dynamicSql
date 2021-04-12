package com.zzjm;

import com.zzjm.Utils.Myutil;
import com.zzjm.dao.StudentDao;
import com.zzjm.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void SelectStudentIfTest(){
        SqlSession sqlSession= Myutil.getSqlSession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("李四");
        student.setAge(10);
        List<Student> studentList=studentDao.selectStudentIf(student);
        for (Student student1:studentList){
            System.out.println(student1);
        }
    }
    @Test
    public void SelectStudentWhereTest(){
        SqlSession sqlSession= Myutil.getSqlSession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("李四");
        student.setAge(1);
        List<Student> studentList=studentDao.selectStudentWhere(student);
        for (Student student1:studentList){
            System.out.println(student1);
        }
    }
    @Test
    public void SelectStudentForeachTest(){
        SqlSession sqlSession= Myutil.getSqlSession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = new ArrayList<>();
        Student student=new Student();
        student.setId(1001);
        studentList.add(student);
        student=new Student();
        student.setId(1002);
        studentList.add(student);
        List<Student> students=studentDao.selectStudentForeach(studentList);
        for (Student student1:students){
            System.out.println(student1);
        }
    }
}
