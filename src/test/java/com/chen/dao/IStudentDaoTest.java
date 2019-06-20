package com.chen.dao;

import com.chen.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author chenyam
 * @title: IStudentDaoTest
 * @projectName SSM
 * @description: student 测试
 * @date 2019/6/17 14:28
 */
@ContextConfiguration("classpath:spring-mybatis.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IStudentDaoTest {

    @Autowired
    IStudentDao studentDao;
    @Test
    public void findStudentById() {
        Student student = studentDao.findStudentById(1);
        System.out.println(student);
    }
    @Test
    public void findStudents(){
        List<Student> students = studentDao.findStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void addStudent() {
        Student student = new Student();
        student.setName("view");
        student.setAge(21);
       studentDao.addStudent(student);
    }
}