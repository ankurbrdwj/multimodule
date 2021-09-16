package com.ankur.joi.dto;

import java.util.List;

public class CreateReadingRequest {
    Long smartMeterId;
    List<ElectricityReading> electricityReadings;
}