package com.softeal.ServiceImpl;

import com.softeal.InterFace.VehiclesI;
import com.softeal.Model.Vehicles;
import com.softeal.Repository.VehiclesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SOFTWARE02 on 29.09.2018.
 */

@Service
public class VehiclesImpl implements VehiclesI {

    @Autowired
    VehiclesRepo vehiclesRepo;

    @Override
    public List<Vehicles> getAllVehicles() {
        return vehiclesRepo.findAll();
    }

    public List<Vehicles> getVehicle(String observer) {
        return vehiclesRepo.findByObserver(observer);
    }
}
