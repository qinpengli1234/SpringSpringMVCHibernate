package com.ssh.service.impl;

import com.ssh.dao.DeptDao;
import com.ssh.entity.Dept;
import com.ssh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/12/28.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.insertDept(dept) > 0 ? true : false;
    }

    @Transactional(readOnly = true)
    public Dept findDept(int deptno) {
        return deptDao.selectDept(deptno);
    }
}
