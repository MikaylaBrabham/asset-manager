package com.pluralsight;

import java.util.ArrayList;

public class Main {
    //add main
        public static void main(String[] args) {

            //add arrat
            ArrayList<Assets> assets = new ArrayList<>();


            //add my house and car
            House house = new House(
                            "My House",
                            "2020-01-01",
                            250000,
                            "123 Main St",
                            1,
                            2000,
                            5000);

            Vehicle car = new Vehicle(
                            "Honda Civic",
                            "2021-05-05",
                            22000,
                            2021,
                            "Honda Civic",
                            40000);

            assets.add(house);
            assets.add(car);

            for (Assets asset : assets) {

                System.out.println(asset.getDescription());

                System.out.println(asset.getValue());

                System.out.println();
            }
        }
    }