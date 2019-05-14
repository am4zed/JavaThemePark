package AttractionsTest;

import Attractions.Dodgems;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        dodgems = new Dodgems("Bump 'n' Grind", 6);
        visitor1 = new Visitor("Pam", 15, 171, 15.00);
        visitor2 = new Visitor("Steve", 34, 165, 20.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bump 'n' Grind", dodgems.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(6, dodgems.getRating());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(3.00, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void hasPriceForUnderEighteen() {
        assertEquals(2.00, dodgems.priceFor(visitor1), 0.01);
    }

    @Test
    public void hasPriceForOverEighteen() {
        assertEquals(5.00, dodgems.priceFor(visitor2), 0.01);
    }
}
