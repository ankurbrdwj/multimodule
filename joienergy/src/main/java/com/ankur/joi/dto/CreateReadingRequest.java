package com.ankur.joi.dto;

import java.util.List;

public class CreateReadingRequest {
    String smartMeterId;
    List<ElectricityReading> electricityReadings;
}