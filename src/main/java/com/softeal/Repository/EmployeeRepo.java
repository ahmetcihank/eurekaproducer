package com.softeal.Repository;

import com.softeal.Model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by SOFTWARE02 on 6/23/2018.
 */
public interface EmployeeRepo extends CrudRepository<Employee,Long> {



}
