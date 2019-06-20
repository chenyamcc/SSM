package com.chen.dao;

import com.chen.entity.Student;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;


/**
 * @author chenyam
 * @title: StudentTest
 * @projectName SSM
 * @description: TODO
 * @date 2019/6/17 16:23
 */
public class StudentTest {

    @Test
    public void getStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        Student bean = context.getBean(Student.class);
        System.out.println(bean);
    }

    @Test
    public void test() {
        Student student = new Student();
        Map<String,String[]> map = new HashMap<String, String[]>();

        map.put("id",new String[] {"1"});
        map.put("name",new String[]{"xiaoming"});
        map.put("age",new String[]{"12"});
        try {
            BeanUtils.populate(student,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(student);
    }


}
