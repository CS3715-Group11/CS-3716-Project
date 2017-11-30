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
class ViewSchedule
{
        public ViewSchedule(JFrame parent)//create constructor 
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
    	 	
    	 	//view schedule button
    	 	JButton viewSchedule = new JButton("View Schedule");
        	viewSchedule.setBackground(Color.RED);
        	viewSchedule.setOpaque(true);
        	
        	JPanel p = new JPanel(new SpringLayout());
        	p.setLayout(layout);
        	
        	p.add(scheduleRoom);
        	p.add(scheduleSeason);
        	p.add(comboRoom);
        	p.add(comboSeason);
        	p.add(viewSchedule);
        	
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
        
        	layout.putConstraint(SpringLayout.WEST,viewSchedule , 370, SpringLayout.WEST, p);
        	layout.putConstraint(SpringLayout.NORTH, viewSchedule, 70, SpringLayout.NORTH, p);
        	
        	JFrame f = new JFrame("View Schedule");
         	f.getContentPane().add(p);
         	f.pack();
         	f.setSize(600, 130);
         	f.setVisible(true);
         	
         	//action listener for creating schedule
            viewSchedule.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                
                
                
                //Displaying message and clearing text fields
                JOptionPane.showMessageDialog(f.getComponent(0), "...");

            }
        });
         	
        } 
}
        	
        	
        	