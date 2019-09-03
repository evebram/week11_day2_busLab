import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;
    Person person;

    @Before
    public void setUp(){
        busStop = new BusStop("Pitt Street");
        person = new Person();
    }

    @Test
    public void getName(){
        assertEquals("Pitt Street", busStop.stopName());
    }

    @Test
    public void checkQueue(){
        assertEquals(0, busStop.countQueue());
    }

    @Test
    public void checkAddToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.countQueue());
    }

    @Test
    public void checkRemoveToQueue(){
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(2, busStop.countQueue());
    }
}
