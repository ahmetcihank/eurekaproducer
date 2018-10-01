package com.softeal.InterFace;

import com.softeal.Model.Employee;

import java.util.List;

/**
 * Created by SOFTWARE02 on 6/23/2018.
 */
public interface EmployeeI {

    public List<Employee> getAllEmployees();
    public List<Employee> saveEmployee(Employee employee) throws InterruptedException;
    public List<Employee> deleteEmployee(long Id) throws InterruptedException;

}
