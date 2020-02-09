package com.languoxing.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/*
 * 上述代码中，首先使用 @Service 注解将 PersonServiceImpl 类标识为 Spring 中的 Bean，
 * 其写法相当于配置文件中 <bean id="personService"class="com.mengma.annotation.PersonServiceImpl"/> 的书写。
 *
 *  然后使用 @Resource 注解标注在属性 personDao 上（也可标注在 personDao 的 setPersonDao() 方法上），
 *  这相当于配置文件中 <property name="personDao"ref="personDao"/> 的写法。最后在该类的 add() 方法中调用 personDao 中的 add() 方法，并输出一句话。
 */

//@Service:通常作用在业务层（Service 层），用于将业务层的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
@Service("personService")
public class PersonServiceImpl implements PersonService {
    // 定义接口声明
    // @Resource:其作用与 Autowired 一样。其区别在于 @Autowired 默认按照 Bean 类型装配，
    // 而 @Resource 默认按照 Bean 实例名称进行装配。
    @Resource(name = "personDao")
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.languoxing.spring_demo.PersonService#addPerson()
     */
    @Override
    public void add() {
        personDao.add(); // 调用PersonDao中的add()方法
        System.out.println("Service层的add() is running...");
    }

}
