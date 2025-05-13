package com.pluralsight;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

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
        this.condition = condition;
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



    @Override
    public double getValue() {
        double rate;
//        System.out.println("\nHouse value is determined as: ");
        switch (condition) {
            case 1:
                rate = 180.0;
                break;
            case 2:
                rate = 130.0;
                break;
            case 3:
                rate = 90.0;
                break;
            case 4:
                rate = 80.0;
                break;
            default:
                rate = 0.0;
                break;
        }

        double conditionValue = squareFoot * rate;
        double lotValue = lotSize * 0.25;

        return conditionValue + lotValue;
    }
}
