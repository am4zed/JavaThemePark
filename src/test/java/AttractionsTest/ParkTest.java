package AttractionsTest;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Acorn Park", 8);
    }

    @Test
    public void hasName(){
        assertEquals("Acorn Park", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(8, park.getRating());
    }
}
