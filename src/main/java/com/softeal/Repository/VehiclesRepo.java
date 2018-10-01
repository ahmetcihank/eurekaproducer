package com.softeal.Repository;

import com.softeal.Model.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by SOFTWARE02 on 29.09.2018.
 */
public interface VehiclesRepo extends JpaRepository<Vehicles,String> {

    public List<Vehicles> findByObserver(String observer);
}
