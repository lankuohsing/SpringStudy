package com.languoxing.spring_demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * http://c.biancheng.net/view/4251.html
 * 1.新建lib文件夹(此例子里面是在src目录下），将Spring框架所需的JAR包复制到项目的lib目录中，
 *   并添加到类路径下(选中jar包，右键Build Path)
 * eclipse自带junit，手动add到build path即可
 * 2.在 src 目录下创建 Spring 的核心配置文件 applicationContext.xml
 *  Spring 的配置文件名称是可以自定义的，通常情况下，都会将配置文件命名为 applicationContext.xml（或 bean.xml）。
 */
public class Test01 {
    @Test
    public void testl() {

        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取personDao实例
        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
        // 调用 personDao 的 add ()方法
        personDao.add();
        System.out.println("Test01.testl()");
    }

    @Test
    public void test2() {

        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取personService实例
        PersonService personService = (PersonService) applicationContext.getBean("personService");
        // 调用personService的addPerson()方法
        personService.addPerson();
        System.out.println("Test01.test2()");
    }
}
