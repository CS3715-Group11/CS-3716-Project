//import statements
import java.awt.*;
import java.util.Date;
import java.awt.event.*;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
class CreateSchedule
{
        public CreateSchedule(JFrame parent)//create constructor 
        {	

        	SpringLayout layout = new SpringLayout();
        	//creating JLabels
        	JLabel scheduleRoom = new JLabel("Select Room:");
        	JLabel scheduleSeason = new JLabel("Select Season:");
        	
        	//create combo box objects
       	 	JComboBox<String> comboRoom = new JComboBox<String>();
       	 	comboRoom.addItem("Gymnasium");
       	 	comboRoom.addItem("Auditorium");
       	 	comboRoom.addItem("Cafeteria");
       	 	comboRoom.addItem("Library");
       	 	comboRoom.addItem("Lecture Room");
       	 	//Seasons
       	 	JComboBox<String> comboSeason = new JComboBox<String>();
    	 	comboSeason.addItem("Winter");
    	 	comboSeason.addItem("Spring");
    	 	comboSeason.addItem("Summer");
    	 	comboSeason.addItem("Fall");
    	 	
    	 	JLabel monday = new JLabel("Monday");
    	 	JComboBox<Integer> startTimeMon = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		startTimeMon.addItem(i);
    	 	}
    	 	JComboBox<Integer> endTimeMon = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		endTimeMon.addItem(i);
    	 	}
    	 	JLabel tuesday = new JLabel("Tuesday");
    	 	JComboBox<Integer> startTimeTues = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		startTimeTues.addItem(i);
    	 	}
    	 	JComboBox<Integer> endTimeTues = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		endTimeTues.addItem(i);
    	 	}
    	 	JLabel wednesday = new JLabel("Wednesday");
    	 	JComboBox<Integer> startTimeWed = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		startTimeWed.addItem(i);
    	 	}
    	 	JComboBox<Integer> endTimeWed = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		endTimeWed.addItem(i);
    	 	}
    	 	JLabel thursday = new JLabel("Thursday");
    	 	JComboBox<Integer> startTimeThurs = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		startTimeThurs.addItem(i);
    	 	}
    	 	JComboBox<Integer> endTimeThurs = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		endTimeThurs.addItem(i);
    	 	}
    	 	JLabel friday = new JLabel("Friday");
    	 	JComboBox<Integer> startTimeFri = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		startTimeFri.addItem(i);
    	 	}
    	 	JComboBox<Integer> endTimeFri = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		endTimeFri.addItem(i);
    	 	}
    	 	JLabel saturday = new JLabel("Saturday");
    	 	JComboBox<Integer> startTimeSat = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		startTimeSat.addItem(i);
    	 	}
    	 	JComboBox<Integer> endTimeSat = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		endTimeSat.addItem(i);
    	 	}
    	    JLabel sunday = new JLabel("Sunday");
    	    JComboBox<Integer> startTimeSun = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		startTimeSun.addItem(i);
    	 	}
    	 	JComboBox<Integer> endTimeSun = new JComboBox<Integer>();
    	 	for(int i=0; i<24; i++){
    	 		endTimeSun.addItem(i);
    	 	}
    	 	//Adding to panel
    	 	JPanel p = new JPanel(new SpringLayout());
        	p.setLayout(layout);
        	p.add(scheduleRoom);
    	 	p.add(scheduleSeason);
        	p.add(comboRoom);
        	p.add(comboSeason);
        	p.add(monday);
        	p.add(startTimeMon);
        	p.add(endTimeMon);
        	p.add(tuesday);
        	p.add(startTimeTues);
        	p.add(endTimeTues);
        	p.add(wednesday);
        	p.add(startTimeWed);
        	p.add(endTimeWed);
        	p.add(thursday);
        	p.add(startTimeThurs);
        	p.add(endTimeThurs);
        	p.add(friday);
        	p.add(startTimeFri);
        	p.add(endTimeFri);
        	p.add(saturday);
        	p.add(startTimeSat);
        	p.add(endTimeSat);
        	p.add(sunday);
        	p.add(startTimeSun);
        	p.add(endTimeSun);
        	
        	//room
        	layout.putConstraint(SpringLayout.WEST,scheduleRoom , 10, SpringLayout.WEST, p);
        	layout.putConstraint(SpringLayout.NORTH, scheduleRoom, 25, SpringLayout.NORTH, p);
        	layout.putConstraint(SpringLayout.NORTH, comboRoom, 22, SpringLayout.NORTH, p);
        	layout.putConstraint(SpringLayout.WEST, comboRoom,22, SpringLayout.EAST, scheduleRoom);

        	//season
        	layout.putConstraint(SpringLayout.WEST,scheduleSeason , 35, SpringLayout.EAST, comboRoom);
        	layout.putConstraint(SpringLayout.NORTH, scheduleSeason, 25, SpringLayout.NORTH, p);
        	layout.putConstraint(SpringLayout.NORTH, comboSeason, 22, SpringLayout.NORTH, p);
        	layout.putConstraint(SpringLayout.WEST, comboSeason,22, SpringLayout.EAST, scheduleSeason);
        	
        	
        	JFrame f = new JFrame("Create Schedule");
         	f.getContentPane().add(p);
         	f.pack();
         	f.setSize(690, 625);
         	f.setVisible(true);
        } 
}
       	 
       	 