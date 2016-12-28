package com.ssh.dao;

import com.ssh.entity.Dept;

/**
 * Created by Administrator on 2016/12/28.
 */
public interface DeptDao {

    int insertDept(Dept dept);

    Dept selectDept(int deptno);
}
