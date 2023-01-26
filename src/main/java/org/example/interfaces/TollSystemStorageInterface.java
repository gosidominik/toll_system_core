package org.example.interfaces;

import org.example.entity.MotorwayVignette;

public interface TollSystemStorageInterface {
    MotorwayVignette getVignetteByVehicleRegistration(String regNum);
}
