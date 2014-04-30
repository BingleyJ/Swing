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

public class SandwichMeats extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    private String currentMenu = "meats";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Sandwhich Meat");
    JButton roastBtn = new JButton("Roast Beef");
    JButton chickenBtn = new JButton("Chicken");
    JButton turkeyBtn = new JButton("Turkey");
    JButton hamBtn = new JButton("Ham");
    JButton steakBtn = new JButton("Steak");
    JButton porkBtn = new JButton("Pulled Pork");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener roastLsnr = new ClickListenerRoast();
    ActionListener chickenLsnr = new ClickListenerChicken();
    ActionListener turkeyLsnr = new ClickListenerTurkey();
    ActionListener hamLsnr = new ClickListenerHam();
    ActionListener steakLsnr = new ClickListenerSteak();
    ActionListener porkLsnr = new ClickListenerPork();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public SandwichMeats()
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
        setTitle("Steaks");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(roastBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(chickenBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(turkeyBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(hamBtn, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(steakBtn, c);

        c.gridx = 2; c.gridy = 2;
        mainPanel.add(porkBtn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        
        roastBtn.addActionListener(roastLsnr);
        chickenBtn.addActionListener(chickenLsnr);
        turkeyBtn.addActionListener(turkeyLsnr);
        hamBtn.addActionListener(hamLsnr);
        steakBtn.addActionListener(steakLsnr);
        porkBtn.addActionListener(porkLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerRoast implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerChicken implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerTurkey implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerHam implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerSteak implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides(currentMenu);
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerPork implements ActionListener
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

