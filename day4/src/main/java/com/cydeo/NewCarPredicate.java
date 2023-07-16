package com.cydeo;

public class NewCarPredicate implements CarPredicate{
    @Override
    public boolean test(Car car) {
        return car.getYear()>2019;
    }
}
