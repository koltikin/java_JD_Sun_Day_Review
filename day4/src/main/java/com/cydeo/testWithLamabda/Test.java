package com.cydeo.testWithLamabda;

import com.cydeo.Car;
import com.cydeo.NewCarPredicate;
import com.cydeo.SpeedPredicate;

import java.util.ArrayList;
import java.util.List;

import static com.cydeo.Main.predicate;

public class Test {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("audi",180,2020));
        cars.add(new Car("toyota",150,2016));
        cars.add(new Car("BMW",200,2018));
        cars.add(new Car("mercedes",190,2016));
        cars.add(new Car("reno",180,2022));

        predicate(cars,(car)-> car.getYear()>2019);
        System.out.println("------------------------------------------------");
        predicate(cars,car -> car.getTopSpeed()>180);

    }

}