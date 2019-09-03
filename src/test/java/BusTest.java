import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void setUp(){
        bus = new Bus("Dunbar", 15);
        person = new Person();
        busStop = new BusStop("Pitt Street");
        busStop.addToQueue(person);
    }

    @Test
    public void busDestination(){
        assertEquals("Dunbar", bus.getDestination());
    }

    @Test
    public void busCapacity(){
        assertEquals(15, bus.getCapacity());
    }

    @Test
    public void checkPassengerCount(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checkAddPassengers(){
        bus.addPassengers(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkRemovePassengers(){
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.removePassengers();
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void checkTakePassengerFromStop() {
        bus.takePassengerFromStop(busStop);
        assertEquals(1, bus.passengerCount());
    }
}
