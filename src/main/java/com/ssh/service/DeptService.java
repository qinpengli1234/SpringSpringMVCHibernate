package com.ssh.service;

import com.ssh.entity.Dept;

/**
 * Created by Administrator on 2016/12/28.
 */
public interface DeptService  {
    boolean addDept(Dept dept);

    Dept findDept(int deptno);
}
