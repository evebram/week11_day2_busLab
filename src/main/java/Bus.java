import java.util.ArrayList;

public class Bus {

    private int capacity;
    private String destination;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public String getDestination(){
        return this.destination;
    }


    public int getCapacity() {
        return this.capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengers(Person person) {
        if(this.passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassengers() {
        this.passengers.remove(0);
    }

    public void takePassengerFromStop(BusStop busStop){
        Person person = busStop.removeFromQueue();
        this.passengers.add(person);
    }
}
