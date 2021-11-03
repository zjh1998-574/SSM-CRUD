package com.cqupt.crud.controller;

import com.cqupt.crud.bean.Department;
import com.cqupt.crud.bean.Msg;
import com.cqupt.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ZJH
 * @create 2021-08-24 14:46
 */
@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    /*
     *返回所有的部门信息
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> depts = departmentService.getDepts();
        return Msg.success().add("depts",depts);
    }
}
