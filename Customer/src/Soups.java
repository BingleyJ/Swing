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

public class Soups extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    private String currentMenu;
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Soups");
    JButton brocolliBtn = new JButton("Brocolli and Cheese");
    JButton noodleBtn = new JButton("Chicken Noodle");
    JButton tomatoBtn = new JButton("Tomato");
    JButton riceBtn = new JButton("Chicken and Wild Rice");
    JButton squashBtn = new JButton("Butternut Squash");
    JButton stewBtn = new JButton("Beef Stew");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener brocolliLsnr = new ClickListenerBrocolli();
    ActionListener noodleLsnr = new ClickListenerNoodle();
    ActionListener tomatoLsnr = new ClickListenerTomato();
    ActionListener riceLsnr = new ClickListenerRice();
    ActionListener squashLsnr = new ClickListenerSquash();
    ActionListener stewLsnr = new ClickListenerStew();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Soups()
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
        setTitle("Main Menu");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(stewBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(brocolliBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(tomatoBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(squashBtn, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(riceBtn, c);

        c.gridx = 2; c.gridy = 2;
        mainPanel.add(noodleBtn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        
        brocolliBtn.addActionListener(brocolliLsnr);
        noodleBtn.addActionListener(noodleLsnr);
        tomatoBtn.addActionListener(tomatoLsnr);
        riceBtn.addActionListener(riceLsnr);
        squashBtn.addActionListener(squashLsnr);
        stewBtn.addActionListener(stewLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerBrocolli implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerNoodle implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerTomato implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerRice implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerSquash implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerStew implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
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