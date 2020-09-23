package cn.hao.springTest;

import cn.hao.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    @Test
    //测试bean的scope属性
    public  void test1(){
        ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao)app.getBean("userDao");
        UserDao userDao2 = (UserDao)app.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
