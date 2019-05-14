package Attractions;

import Interfaces.ISecurity;
import ThemeParkStuff.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getHeight() > 145 && visitor.getAge() > 12){
            return true;
        }
        else {
            return false;
        }
    }
}
