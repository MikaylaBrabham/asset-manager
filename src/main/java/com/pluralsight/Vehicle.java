package com.pluralsight;

public class Vehicle extends Assets{

    //add properties
        private int year;
        private String makeModel;
        private int odometer;

        //add constructor
    public Vehicle(String description, String dateAcquired, double originalCost, int year,
        String makeModel, int odometer) {
        //add super
            super(description, dateAcquired, originalCost);

            this.year = year;
            this.makeModel = makeModel;
            this.odometer = odometer;
        }

        //add getter
        public int getYear() {
            return year;
        }

        public String getMakeModel() {
            return makeModel;
        }

        public int getOdometer() {
            return odometer;
        }

        @Override
        public double getValue() {

            double value =
                    getOriginalCost();

            value -= (odometer * .10);

            return value;
        }
    }





















}
