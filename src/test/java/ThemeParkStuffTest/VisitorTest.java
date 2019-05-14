package ThemeParkStuffTest;

import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Sammy", 16, 165, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Sammy", visitor.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(16, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(165, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(10.00, visitor.getMoney(), 0.01);
    }
}
