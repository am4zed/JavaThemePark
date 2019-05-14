package Attractions;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import ThemeParkStuff.Visitor;

public class Attraction implements IReviewed, ITicketed{

    private String name;
    private int rating;

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public double defaultPrice(){
        return 3.00;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge() < 18){
            return 2.00;
        }
        else {
            return 5.00;
        }
    }

}

