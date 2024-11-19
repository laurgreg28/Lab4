/* EventPlanner created GUI Frame and adds EventListPanel to it*/

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

//EventPlanner class
public class EventPlanner {

    //Constants variables for frame
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 800;


    //Main function to created frame and add panel
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Event Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creates EventListPanel and adds it to the frame
        EventListPanel eventListPanel = new EventListPanel();
        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        frame.getContentPane().add(eventListPanel);
        frame.pack();
        frame.setVisible(true);
    }

    //Creates default events
    public static void addDefaultEvents(EventListPanel events){

        //Default Deadline
        Deadline defaultDeadline = new Deadline("Default Deadline", LocalDateTime.of(2024, 9, 25, 15, 00));

        //Default Meeting
        Meeting defaultMeeting = new Meeting("Default Meeting", LocalDateTime.of(2024, 9, 26, 15, 00),
                LocalDateTime.of(2024, 9, 26, 16, 00), "Library");

        //Add to EventFrame
        events.addEvent(defaultDeadline);
        events.addEvent(defaultMeeting);

    }
}

