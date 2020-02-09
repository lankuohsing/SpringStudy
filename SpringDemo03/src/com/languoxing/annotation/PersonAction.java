package com.languoxing.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

/*
 * 首先使用 @Controller 注解标注 PersonAction 类，
 * 其写法相当于在配置文件中编写 <bean id="personAction"class="com.mengma.annotation.PersonAction"/>。
 *
 * 然后使用了 @Resource 注解标注在 personService 上，
 * 这相当于在配置文件内编写 <property name="personService"ref="personService"/>。
 */
@Controller("personAction")
public class PersonAction {
    @Resource(name = "personService")
    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void add() {
        personService.add(); // 调用personService中的add()方法
        System.out.println("Action层的add()is running...");
    }
}
