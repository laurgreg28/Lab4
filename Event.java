/*Event Class that sets the name and Date of the Event*/

import java.time.LocalDateTime;
import java.util.ArrayList;

//Event Class
public class Event implements Comparable<Event> {
    private String name;
    private LocalDateTime dateTime;

    //Constructor
    public Event() {}

    //Setters and getters for Name and Date
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    //Compares the events
    @Override
    public int compareTo(Event e) {
        return this.dateTime.compareTo(e.dateTime);
    }
}