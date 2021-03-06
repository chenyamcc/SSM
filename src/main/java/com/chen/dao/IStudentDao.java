package com.chen.dao;

import com.chen.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chenyam
 * @title: IStudentDao
 * @projectName SSM
 * @description: 学生类的数据访问层
 * @date 2019/6/17 11:14
 */
@Repository("studentDao")
public interface IStudentDao {
    /**
     * 功能描述:根据学生id查询学生
     *
     * @param id 学生id
     * @return: com.chen.entity.Student
     * @Author: chenyam
     * @Date: 2019/6/17 11:29
     */
    Student findStudentById(int id);

    /**
     * 功能描述: 查询所有学生
     *
     * @return: java.util.List<com.chen.entity.Student>
     * @Author: chenyam
     * @Date: 2019/6/17 15:43
     */
    List<Student> findStudents();

    /**
     * 功能描述:添加学生
     *
     * @param student 学生
     * @return: void
     * @Author: chenyam
     * @Date: 2019/6/17 15:53
     */
    void addStudent(Student student);
}
