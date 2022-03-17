package tddClass.airCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    @Test
    public void testThatAirConditionCanBeCreated() {
        AirCondition airConditional = new AirCondition();
        assertNotNull(airConditional);
    }

    @Test
    public void testThatAirConditionCanHaveName() {
        AirCondition airConditional = new AirCondition();
        airConditional.SetName("scanfrost");
        assertEquals("scanfrost", airConditional.getName());

    }

    @Test
    public void testThatAirConditionCanHaveColour() {
        AirCondition airConditional = new AirCondition();
        airConditional.setColour("white");
        assertEquals("white", airConditional.getColour());

    }

    @Test
    public void testThatAirConditionerCanHaveTemperature() {
        AirCondition airConditional = new AirCondition();
        airConditional.setTemperature(16);
        assertEquals(16, airConditional.getTemperature());
    }

    @Test
    void testThatAirConditionerCanBeOnAndOff() {
        AirCondition airConditional = new AirCondition();
        assertFalse(airConditional.getPowerOnOff());
        airConditional.powerOnOff();
        assertTrue(airConditional.getPowerOnOff());
    }

    @Test
    void testThatAirConditionerTemperatureCanBeIncreased() {
        AirCondition airConditional = new AirCondition();
        airConditional.setTemperature(16);
        airConditional.increaseTemperature();
        assertEquals(17, airConditional.getTemperature());
    }


    @Test
    void testThatAirConditionerTemperatureCanBeDecreased() {
        AirCondition airConditional = new AirCondition();
        airConditional.setTemperature(16);
        airConditional.DecreasedTemperature();
        assertEquals(15, airConditional.getTemperature());
    }

}



