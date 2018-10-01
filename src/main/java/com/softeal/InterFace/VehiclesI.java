package com.softeal.InterFace;

import com.softeal.Model.Vehicles;

import java.util.List;

/**
 * Created by SOFTWARE02 on 29.09.2018.
 */
public interface VehiclesI {

    public List<Vehicles> getAllVehicles();
    public List<Vehicles> getVehicle(String observer);

}
