package com.zhy.factory;

import com.zhy.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: MyFactoryBean
 * @Description: TODO 留下注释吧
 * @Date: 2020/4/14 16:28
 * @Version: 1.0
 **/
public class MyFactoryBean implements FactoryBean<Person> {

    /**
     * 工厂方法，返回需要创建的对象
     * @return
     * @throws Exception
     */
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setName("maliu");
        return person;
    }
    /**
     * 返回创建对象的类型,spring会自动调用该方法返回对象的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    /**
     * 创建的对象是否是单例对象
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
