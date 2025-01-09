package calculator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest
{
    @Test
    public void testAdd()
    {
        MyClass myClass = new MyClass();

        // Adding a comment to commit
        // Opps, did something wrong, redoing the comment
        // Testing more
        assertEquals(3, myClass.add(1, 2));
        assertEquals(0, myClass.add(-1, 1));
        assertEquals(0, myClass.add(0, 0));
    }

    @Test
    public void testSub()
    {
        MyClass myClass = new MyClass();

        // Adding a comment to commit
        // Opps, did something wrong, redoing the comment
        // Testing more
        assertEquals(-1, myClass.sub(1, 2));
        assertEquals(-2, myClass.sub(-1, 1));
        assertEquals(0, myClass.sub(0, 0));
    }
}
