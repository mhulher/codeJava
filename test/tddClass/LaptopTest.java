package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LaptopTest {
    @Test
    public void testThatLaptopCanBECreated(){
        Laptop item1 = new Laptop();
        assertNotNull(item1);
    }
    @Test
    public void testThatLaptopHasAName(){
        Laptop item1 = new Laptop();
        item1.setName("Lenovo");
        assertEquals("Lenovo",item1.getName());
    }

    @Test
    public void testThatLaptopHasColor(){
        Laptop item1 = new Laptop();
        item1.setColor("Black");
        assertEquals("Black",item1.getColor());
    }

    @Test
    public void testThatLaptopHasPowerSwitch(){
        Laptop item1 = new Laptop();
        item1.switchPower();
        assertTrue(item1.getPower());
    }


}
