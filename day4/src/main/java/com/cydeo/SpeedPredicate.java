package com.cydeo;

public class SpeedPredicate implements CarPredicate{
    @Override
    public boolean test(Car car) {
        return car.getTopSpeed()>180;
    }


}
