package com.chen.service.impl;

import com.chen.dao.IStudentDao;
import com.chen.entity.Student;
import com.chen.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author chenyam
 * @title: StudentServiceImpl
 * @projectName SSM
 * @description: 学生业务实现类
 * @date 2019/6/17 11:08
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    private IStudentDao studentDao;

    public StudentServiceImpl(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getStudentById(int id) {
        return studentDao.findStudentById(id);
    }

    public List<Student> getStudents() {
        return studentDao.findStudents();
    }
}
