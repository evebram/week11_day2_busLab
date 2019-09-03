import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public String stopName(){
        return this.name;
    }

    public int countQueue(){
        return this.queue.size();
    }

    public void addToQueue(Person person){
        this.queue.add(person);
    }

    public Person removeFromQueue() {
        return this.queue.remove(0);
    }
}
