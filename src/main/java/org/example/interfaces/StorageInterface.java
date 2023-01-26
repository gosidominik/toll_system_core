package org.example.interfaces;

import org.example.entity.MotorwayVignette;

public interface StorageInterface {
    MotorwayVignette getVignetteByVehicleRegistration(String regNum);
}
