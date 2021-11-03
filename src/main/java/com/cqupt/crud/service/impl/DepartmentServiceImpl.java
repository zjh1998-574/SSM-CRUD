package com.cqupt.crud.service.impl;

import com.cqupt.crud.bean.Department;
import com.cqupt.crud.dao.DepartmentMapper;
import com.cqupt.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZJH
 * @create 2021-08-24 14:44
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Department> getDepts() {
        List<Department> departments = departmentMapper.selectByExample(null);
        return departments;
    }
}
