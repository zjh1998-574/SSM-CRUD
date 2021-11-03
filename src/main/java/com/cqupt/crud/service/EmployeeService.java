package com.cqupt.crud.service;

import com.cqupt.crud.bean.Employee;

import java.util.List;

/**
 * @author ZJH
 * @create 2021-08-21 15:34
 */
public interface EmployeeService {

    /*
      查询所有员工
    */
    public List<Employee> getAll();


    /*
        员工保存
    */
    public void saveEmp(Employee employee);

    /*
        检验用户名是否可用
     */
    public boolean checkUser(String empName);


    /**
     * @Description:  按照员工id查询员工信息
     * @Param: id
     * @return: Employee对象
     * @Author:  Zjh
     * @Date: 2021/8/25
     */
    public Employee getEmp(Integer id);


    /**
     * @Description: 员工更新
     * @Param: employee
     * @return:
     * @Author:  Zjh
     * @Date: 2021/8/25
     */
    public void updateEmp(Employee employee);


    /**
     * @Description: 员工删除
     * @Param: id
     * @return:
     * @Author:  Zjh
     * @Date: 2021/8/25
     */
    public void deleteEmp(Integer id);


    /**
     * @Description: 员工批量删除
     * @Param: ids(删除员工id的集合)
     * @return:
     * @Author:  Zjh
     * @Date: 2021/8/25
     */
    public  void deleteBatch(List<Integer> ids);
}
