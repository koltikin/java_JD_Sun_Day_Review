package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("audi",180,2020));
        carList.add(new Car("toyota",150,2016));
        carList.add(new Car("BMW",200,2018));
        carList.add(new Car("mercedes",190,2016));
        carList.add(new Car("reno",180,2022));

        predicate(carList,new SpeedPredicate());
        System.out.println("------------------------------------------------");
        predicate(carList,new NewCarPredicate());

    }

    public static void predicate(List<Car> cars,CarPredicate predicate){
        for (Car car : cars) {
            if (predicate.test(car)){
                System.out.println(car);
            }

        }
    }

 }
