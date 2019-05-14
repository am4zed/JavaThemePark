package StallsTest;

import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Mary's Milk Bar", 10, "Mary", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Mary's Milk Bar", iceCreamStall.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, iceCreamStall.getRating());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Mary", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(1, iceCreamStall.getParkingSpot());
    }
}
