package StallsTest;

import Stalls.MargaritaStall;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MargaritaStallTest {

    MargaritaStall margaritaStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        margaritaStall = new MargaritaStall("Tequila Mockingbird", 10, "Jed", 3);
        visitor1 = new Visitor("Terry", 21, 164, 20.00);
        visitor2 = new Visitor("Sadie", 17, 162, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Tequila Mockingbird", margaritaStall.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, margaritaStall.getRating());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Jed", margaritaStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(3, margaritaStall.getParkingSpot());
    }

    @Test
    public void visitorIsAllowedToVisit() {
        assertEquals(true, margaritaStall.isAllowedTo(visitor1));
    }

    @Test
    public void visitorIsNotAllowedToVisit() {
        assertEquals(false, margaritaStall.isAllowedTo(visitor2));
    }
}
