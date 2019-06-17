package com.chen.dao;

import com.chen.entity.Student;
import org.springframework.stereotype.Repository;

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
}
