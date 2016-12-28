package com.hc.test;

//import com.alibaba.fastjson.JSONArray;
import com.ssh.dao.DeptDao;
import com.ssh.entity.Dept;
import com.ssh.service.DeptService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/27.
 */
public class AppTest {
    @Test
    public void fun1() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) act.getBean("sqlSessionFactory");

//        sessionFactory.openSession();
//        Session session=sessionFactory.getCurrentSession();

        Session session1 = sessionFactory.openSession();
        Session session2 = sessionFactory.openSession();
        System.out.println(session1 == session2);
    }


    @Test
    public void fun2() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDao deptDao = (DeptDao) act.getBean("deptDaoImpl");
        int i = deptDao.insertDept(new Dept("44", "44"));
        System.out.println(i);
    }

}
