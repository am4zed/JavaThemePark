package AttractionsTest;

import Attractions.Playground;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Tumble Tots", 8);
        visitor1 = new Visitor("Kitty", 5, 78, 4.00);
        visitor2 = new Visitor("Jack", 16, 170, 8.00);
    }

    @Test
    public void hasName() {
        assertEquals("Tumble Tots", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(8, playground.getRating());
    }

    @Test
    public void visitorIsAllowedToVisit() {
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void visitorIsNotAllowedToVisit() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
