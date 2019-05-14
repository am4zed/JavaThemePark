package ThemeParkStuff;

import Attractions.Attraction;
import Attractions.Dodgems;
import Interfaces.IReviewed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Visitor> visitors;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(String name){
        this.name = name;
        this.visitors = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public int countVisitors() {
        return visitors.size();
    }

    public int countAttractions() {
        return attractions.size();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviewedPlaces = new ArrayList<>();
        for(Attraction attraction : attractions){
            reviewedPlaces.add(attraction);
        }
        for(Stall stall : stalls){
            reviewedPlaces.add(stall);
        }
        return reviewedPlaces;
    }

    public void addPlace(Attraction attraction) {
        attractions.add(attraction);
    }

    public void addPlace(Stall stall) {
        stalls.add(stall);
    }
}
