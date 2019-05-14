package Stalls;

import Interfaces.IReviewed;

public class Stall implements IReviewed {

    private String name;
    protected int rating;
    private String ownerName;
    private int parkingSpot;

    public Stall(String name, int rating, String ownerName, int parkingSpot) {
        this.name = name;
        this.rating = rating;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

}
