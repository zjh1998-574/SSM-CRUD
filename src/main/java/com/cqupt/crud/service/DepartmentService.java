package com.cqupt.crud.service;

import com.cqupt.crud.bean.Department;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZJH
 * @create 2021-08-24 14:42
 */

@Service
public interface DepartmentService {

    public List<Department> getDepts();
}
