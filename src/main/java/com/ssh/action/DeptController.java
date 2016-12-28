package com.ssh.action;

import com.ssh.entity.Dept;
import com.ssh.service.DeptService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/add")
    public ModelAndView addDept(Dept dept){
        boolean res = deptService.addDept(dept);
        return new ModelAndView("/index.jsp","res",res);
    }

    @RequestMapping("/showDeptById")
    public ModelAndView showDeptById(int id){
        Dept dept = deptService.findDept(id);
        return new ModelAndView("/deptShow.jsp","dept",dept);
    }


}
