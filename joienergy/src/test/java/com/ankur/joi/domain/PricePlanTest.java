package com.ankur.joi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PricePlanTest {


    @Test
    public void testPlanConstructor() {
        PricePlan pp = new PricePlan(null, "Test Supplier Name", null, null);
        Assertions.assertEquals(pp.getPlanName(), "Test Supplier Name");
    }
}
