package ThemeParkStuffTest;

import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.MargaritaStall;
import ThemeParkStuff.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    Rollercoaster rollercoaster;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    MargaritaStall margaritaStall;

    @Before
    public void before(){
        themePark = new ThemePark("Adventure Land");
        dodgems = new Dodgems("Bump 'n' Grind", 6);
        park = new Park("Acorn Park", 8);
        playground = new Playground("Tumble Tots", 8);
        rollercoaster = new Rollercoaster("Loop-de-loop", 7);
        candyFlossStall = new CandyFlossStall("Flossin", 9, "Joey", 2);
        iceCreamStall = new IceCreamStall("Mary's Milk Bar", 10, "Mary", 1);
        margaritaStall = new MargaritaStall("Tequila Mockingbird", 10, "Jed", 3);
        themePark.addPlace(dodgems);
        themePark.addPlace(park);
        themePark.addPlace(playground);
        themePark.addPlace(rollercoaster);
        themePark.addPlace(candyFlossStall);
        themePark.addPlace(iceCreamStall);
        themePark.addPlace(margaritaStall);


    }

    @Test
    public void hasName(){
        assertEquals("Adventure Land", themePark.getName());
    }

    @Test
    public void hasNoVisitorsInitially(){
        assertEquals(0, themePark.countVisitors());
    }

    @Test
    public void canReturnAllReviewedPlaces() {
        assertEquals(7, themePark.getAllReviewed().size());
    }
}
