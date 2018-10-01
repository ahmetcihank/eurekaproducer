package com.softeal.Controller;

import com.softeal.Model.Employee;
import com.softeal.Model.Vehicles;
import com.softeal.ServiceImpl.EmployeeImpl;
import com.softeal.ServiceImpl.VehiclesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SOFTWARE02 on 6/23/2018.
 */

@RestController
public class EmployeeController {

    @Autowired
    VehiclesImpl vehiclesImpl;

    @Autowired
    EmployeeImpl employeeImpl;

    @GetMapping("getEmployees")
    public List<Employee> getEmployees(){

        return employeeImpl.getAllEmployees();
    }

    @GetMapping("getVehicles")
    public List<Vehicles> getVehicles(){
        return vehiclesImpl.getAllVehicles();
    }

    @GetMapping("getVehicle")
    public List<Vehicles> getVehicle(@RequestParam("observer") String observer){
      return  vehiclesImpl.getVehicle(observer);
    }


}
