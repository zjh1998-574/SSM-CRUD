package com.cqupt.crud.service.impl;

import com.cqupt.crud.bean.Employee;
import com.cqupt.crud.bean.EmployeeExample;
import com.cqupt.crud.dao.EmployeeMapper;
import com.cqupt.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZJH
 * @create 2021-08-21 15:35
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    /*
     *查询所有员工
     */
    @Override
    public List<Employee> getAll() {
        List<Employee> employees = employeeMapper.selectByExampleWithDept(null);
        return employees;
    }
    /*
        保存员工
     */
    @Override
    public void saveEmp(Employee employee) {
        int i =employeeMapper.insertSelective(employee);
    }
    /*
        检验用户名是否可用
     */
    @Override
    public boolean checkUser(String empName) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmpNameEqualTo(empName);
        long count = employeeMapper.countByExample(example);
        return count==0;
    }


    /**
     * @Description: 按照员工id查询员工信息
     * @Param: id
     * @return:
     * @Author:  Zjh
     * @Date: 2021/8/25
     */
    @Override
    public Employee getEmp(Integer id) {
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        return employee;
    }

    /**
     * @Description: 更新员工信息
     * @Param: employee
     * @return:
     * @Author:  Zjh
     * @Date: 2021/8/25
     */
    @Override
    public void updateEmp(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }


    /**
     * @Description: 单个员工删除
     * @Param:
     * @return:
     * @Author:  Zjh
     * @Date: 2021/8/25
     */
    @Override
    public void deleteEmp(Integer id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    /**
     * @Description: 员工批量删除
     * @Param: ids
     * @return:
     * @Author:  Zjh
     * @Date: 2021/8/25
     */
    @Override
    public void deleteBatch(List<Integer> ids) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmpIdIn(ids);
        employeeMapper.deleteByExample(example);
    }
}
