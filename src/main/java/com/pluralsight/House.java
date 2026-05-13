package com.pluralsight;

import java.util.Scanner;

public class House extends Assets {

    //add given properties
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    //add constructors

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //add getters and setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        //add parameters for conditions so no one can put anything out of bounds
        //add my scanner
        Scanner myScanner = new Scanner(System.in);
        while (condition < 1 || condition > 4) {
            System.out.println("please enter a valid condition 1-4.");
            System.out.println("Your condition is invalid. Please enter a new one!");
            condition = myScanner.nextInt();
            return;

            //this.condition = condition;
        }
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    //add conditions set meaning in switch
    public String conditionMeanings() {
        switch (condition) {
            case 1:
                return "Excellent";

            case 2:
                return "Good";

            case 3:
                return "Fair";

            default:
                return "poor";
        }
    }

    // add value from the assets and overide to inut the conditionals
    @Override
    private double getValue() {

        //enter an array to manage the prices and conditionals
        double[] prices = {180, 130, 90, 80};
        //array starts at 1 thats why -1
        double pricesPerSqFt = prices[condition - 1];
        return (this.squareFoot * pricesPerSqFt) + (lotSize * .25);

    }
}

