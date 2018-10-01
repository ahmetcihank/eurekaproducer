package com.softeal.ServiceImpl;

import com.softeal.InterFace.EmployeeI;
import com.softeal.Model.Employee;
import com.softeal.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SOFTWARE02 on 6/23/2018.
 */

@Service
public class EmployeeImpl implements EmployeeI {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepo.findAll();
    }

    @Override
    public List<Employee> saveEmployee(Employee employee) throws InterruptedException {
        employeeRepo.save(employee);
        Thread.sleep(200);
        return (List<Employee>) employeeRepo.findAll();
    }

    @Override
    public List<Employee> deleteEmployee(long Id) throws InterruptedException {
        employeeRepo.deleteById(Id);
        Thread.sleep(200);
        return (List<Employee>) employeeRepo.findAll();
    }
}

