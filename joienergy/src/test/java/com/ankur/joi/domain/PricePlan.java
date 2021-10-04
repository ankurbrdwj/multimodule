package com.ankur.joi.domain;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.util.List;

public class PricePlan {

    private final String energySupplier;
    private final String planName;
    private final BigDecimal unitRate;
    private final List<PeakTimeMultiplier> peakMultipliers;

    public PricePlan(String energySupplier, String test_supplier_name, BigDecimal unitRate
            , List<PeakTimeMultiplier> peakTimeMultipliers) {
        this.energySupplier = energySupplier;
        this.planName = test_supplier_name;
        this.unitRate = unitRate;
        this.peakMultipliers = peakTimeMultipliers;
    }

    public String getEnergySupplier() {
        return energySupplier;
    }

    public String getPlanName() {
        return planName;
    }

    public BigDecimal getUnitRate() {
        return unitRate;
    }

    public List<PeakTimeMultiplier> getPeakMultipliers() {
        return peakMultipliers;
    }


    static class PeakTimeMultiplier {

        DayOfWeek dayOfWeek;
        BigDecimal multiplier;

        public PeakTimeMultiplier(DayOfWeek dayOfWeek, BigDecimal multiplier) {
            this.dayOfWeek = dayOfWeek;
            this.multiplier = multiplier;
        }
    }
}
