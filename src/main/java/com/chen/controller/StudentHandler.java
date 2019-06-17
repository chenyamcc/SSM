package com.chen.controller;

import com.chen.entity.Student;
import com.chen.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenyam
 * @title: StudentHandler
 * @projectName SSM
 * @description: 学生的handler
 * @date 2019/6/17 12:01
 */
@Controller
public class StudentHandler {
    private IStudentService studentService;

    public StudentHandler(IStudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}
