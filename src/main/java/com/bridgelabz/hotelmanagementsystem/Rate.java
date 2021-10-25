package com.bridgelabz.hotelmanagementsystem;

/**
 * Taking the variables and declare
 * Using constructor to access the class level variable.
 */

public class Rate {
    public Integer weekendRate;
    public Integer weekdayRate;

    public Rate(Integer weekendRate, Integer weekdayRate) {
        this.weekendRate = weekendRate;
        this.weekdayRate = weekdayRate;
    }
}

