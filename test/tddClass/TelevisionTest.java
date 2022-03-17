package tddClass;

import org.junit.jupiter.api.Test;

import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TelevisionTest {
    @Test
    public void thatTelevisionCanBeCreated() {
        Television television = new Television();
        assertNotNull(television);

    }

    @Test
    public void thatTelevisionCanBeTurnOnAndOf() {
        //given that
        Television television = new Television();
        //when
        television.setOn();
        //assert(action)
        assertEquals(true, television.getIsOn());
        television.setOn();
        assertEquals(false, television.getIsOn());


    }

    @Test
    public void thatTelevisionCanHaveName() {
        Television television = new Television();
        television.setName("samsung");
        assertEquals("samsung", television.getName());

    }

    @Test
    public void thatTelevisionCanHaveColour() {
        Television Television = new Television();
        Television.setColour("colour");
        assertEquals("colour", Television.getColour());
    }

    @Test
    public void thatTelevisionCanHaveVolume() {
        Television television = new Television();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        assertEquals(8, television.getVolume());
    }

    @Test
    public void thatTelevisionCanReduceVolume() {
        Television television = new Television();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.setVolume();
        television.decreasedvolume();
        television.decreasedvolume();
        television.decreasedvolume();
        assertEquals(7, television.getVolume());
    }

    //@Test//
    //public void thatTelevisionCanHavelimit(){//
    //  Television television = new Television();//
    //television.setlimit();//
    //assertEquals("15",television.getlimit());//
//}//

    //@Test//
//public void thatTelevisionCanChangeChanell() {//
        //Television television = new Television();//
        //television.ChangeChanell();//
        //assertEquals("")//
//}//

 @Test
public void thatQuotientOfTwoNumbersTest(){
}

}
@Test
public void Test(){
        int number = 2;
        while(number <10){
        System system;
        system.out.print(number+ " ");
        number = number + 2;
        }
}
}



