package StallsTest;

import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Flossin", 9, "Joey", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Flossin", candyFlossStall.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, candyFlossStall.getRating());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Joey", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(2, candyFlossStall.getParkingSpot());
    }
}
