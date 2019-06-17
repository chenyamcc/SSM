package com.chen.service;

import com.chen.entity.Student;

/**
 * @author chenyam
 * @title: IStudentService
 * @projectName SSM
 * @description: 学生业务接口
 * @date 2019/6/17 11:07
 */
public interface IStudentService {
    /**
     * 功能描述:根据学生id查询学生
     *
     * @param id 学生id
     * @return: com.chen.entity.Student
     * @Author: chenyam
     * @Date: 2019/6/17 11:44
     */
    Student getStudentById(int id);
}
