package AttractionsTest;

import Attractions.Rollercoaster;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Loop-de-loop", 7);
        visitor1 = new Visitor("Sharon", 15, 154, 30.00);
        visitor2 = new Visitor("Howard", 11, 146, 5.00);
    }

    @Test
    public void hasName() {
        assertEquals("Loop-de-loop", rollercoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, rollercoaster.getRating());
    }

    @Test
    public void visitorIsAllowedToVisit() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void visitorIsNotAllowedToVisit() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }
}
