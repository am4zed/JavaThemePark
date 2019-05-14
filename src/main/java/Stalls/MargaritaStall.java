package Stalls;

import Interfaces.ISecurity;
import ThemeParkStuff.Visitor;

public class MargaritaStall extends Stall implements ISecurity {

    public MargaritaStall(String name, int rating, String ownerName, int parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
