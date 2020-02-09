package com.languoxing.annotation;

import org.springframework.stereotype.Repository;

/*
 *  首先使用 @Repository 注解将 PersonDaoImpl 类标识为 Spring 中的 Bean，
 *  其写法相当于配置文件中d  <bean id="personDao"class="com.mengma.annotation.PersonDaoImpl"/>
 *  然后在 add() 方法中输出一句话，用于验证是否成功调用了该方法。
 */
//@Repository:用于将数据访问层（DAO层）的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
    /*
     * (non-Javadoc)
     *
     * @see com.languoxing.spring_demo.PersonDao#add()
     */
    @Override
    public void add() {
        System.out.println("Dao层的add() is running...");
    }
}
