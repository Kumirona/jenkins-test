import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    private Cat cat;
    @Before
    public void init() {
        cat = new Cat("lama");
    }

    @Test
    public void catNameTest() {
        assertEquals("lama", cat.getName());
    }
}
