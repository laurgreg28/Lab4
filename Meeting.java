/*Creates the Meeting Event*/

import java.time.Duration;
import java.time.LocalDateTime;

//Meeting Class
public class Meeting extends Event implements Completable{

    //Meeting Variables
    private LocalDateTime endDateTime;
    private String location;
    private boolean complete;

    //Constructor
    public Meeting(String name, LocalDateTime startDateTime, LocalDateTime endDateTime, String location) {
            setName(name);
            setDateTime(startDateTime);
            this.endDateTime = endDateTime;
            this.location = location;
    }

    //sets complete to true
    @Override
    public void complete() {
        this.complete = true;
    }

    //returns complete
    public boolean isComplete() {
        return complete;
    }

    //setters and getters for endDate, location, and duration
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }
    public String getLocation() {
        return location;
    }
    public Duration getDuration() {
        return Duration.between(getDateTime(), endDateTime);
    }
    public void setEndDateTime(LocalDateTime end){
        this.endDateTime = end;
    }
    public void setLocation(String location){
        this.location = location;
    }


}
