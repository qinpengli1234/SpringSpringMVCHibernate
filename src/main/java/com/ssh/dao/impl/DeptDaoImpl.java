package com.ssh.dao.impl;

import com.ssh.dao.DeptDao;
import com.ssh.entity.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/28.
 */
@Repository
public class DeptDaoImpl implements DeptDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional
    public int insertDept(Dept dept) {
        Session session = getSession();
        Serializable res = session.save(dept);//save方法的返回值是当前添加数据在数据表中所对应的主键的值
        System.out.println(res);
        return (int) res;
    }

    public Dept selectDept(int deptno) {
        String hql = "from Dept where deptno = :deptno";
        return (Dept) getSession().createQuery(hql).setParameter("deptno", deptno).uniqueResult();
    }
}
