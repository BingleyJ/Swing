/**************************************************
 * The "CustomerMenu" class creates the frame for *
 * viewing the menu. The customer can select from *
 * from a variety of appetizer's, entre's and     * 
 * dessert's. As the customer selects an item a   *
 * sub-menu containing more information and       *
 * choices replaces the current page. Also, If    *
 * they decide that they have made a mistake or   *
 * changed their mind, they can always go back a  *
 * single page at a time or restart completely by *
 * hitting cancel.                                *
 **************************************************/

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Chicken extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    private String currentMenu = "chicken";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Chicken");
    JButton marsalaBtn = new JButton("Chicken Marsala");
    JButton garlicBtn = new JButton("Garlic Roasted Chicken");
    JButton stroganoffBtn = new JButton("Chicken Stroganoff");
    JButton fryBtn = new JButton("Chicken Stir Fry");
    JButton pieBtn = new JButton("Pot Pie");
    JButton curryBtn = new JButton("Chicken Curry");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener marsalaLsnr = new ClickListenerMarsala();
    ActionListener garlicLsnr = new ClickListenerGarlic();
    ActionListener stroganoffLsnr = new ClickListenerStroganoff();
    ActionListener fryLsnr = new ClickListenerFry();
    ActionListener pieLsnr = new ClickListenerPie();
    ActionListener curryLsnr = new ClickListenerCurry();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Chicken()
    {
        format();
        addLogo();
    }
    
    //Adds the logo to the top of the frame
    private void addLogo()
    {
        logoLbl.setIcon(new ImageIcon("content\\logo.png"));
        logoPanel.add(logoLbl);
        
        add(logoPanel, BorderLayout.NORTH);
    }

    //Formats the components on the panel, except for the logo
    private void format()
    {
        setTitle("Chicken");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(marsalaBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(garlicBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(stroganoffBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(fryBtn, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(pieBtn, c);

        c.gridx = 2; c.gridy = 2;
        mainPanel.add(curryBtn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        
        marsalaBtn.addActionListener(marsalaLsnr);
        garlicBtn.addActionListener(garlicLsnr);
        stroganoffBtn.addActionListener(stroganoffLsnr);
        fryBtn.addActionListener(fryLsnr);
        pieBtn.addActionListener(pieLsnr);
        curryBtn.addActionListener(curryLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerMarsala implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerGarlic implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerStroganoff implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerFry implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerPie implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerCurry implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerBack implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Entrees entree = new Entrees();
        	entree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	entree.setVisible(true);
        }
    }
    
    public class ClickListenerCancel implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFirst menu = new MenuFirst();
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setVisible(true);
        }
    }
}
