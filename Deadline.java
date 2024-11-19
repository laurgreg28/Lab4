/*Creates the Deadline Event*/

import java.time.LocalDateTime;
import java.util.ArrayList;

//Deadline Class
public class Deadline extends Event implements Completable{
    //Complete variable
    private boolean complete;

    // Constuctor
    public Deadline(String name, LocalDateTime endDateTime) {
        setName(name);
        setDateTime(endDateTime);
    }

    //Sets complete to true
    public void complete() {
        this.complete = true;
    }

    //returns complete
    public boolean isComplete() {
        return this.complete;
    }

}
