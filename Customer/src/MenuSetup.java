
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


public class MenuSetup extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Main Menu");
    JButton appetizerBtn = new JButton("Appetizers");
    JButton entreeBtn = new JButton("Entrees");
    JButton dessertBtn = new JButton("Desserts");
    JButton fountainBtn = new JButton("Fountain Drinks");
    JButton alcoholBtn = new JButton("Alcoholic Beverages");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener appetizerLsnr = new ClickListenerAppetizer();
    ActionListener entreeLsnr = new ClickListenerEntree();
    ActionListener dessertLsnr = new ClickListenerDessert();
    ActionListener fountainLsnr = new ClickListenerFountain();
    ActionListener alcoholLsnr = new ClickListenerAlcohol();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public MenuSetup()
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
        mainPanel.add(appetizerBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(entreeBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(dessertBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(fountainBtn, c);

        c.gridx = 2; c.gridy = 2;
        mainPanel.add(alcoholBtn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        
        appetizerBtn.addActionListener(appetizerLsnr);
        entreeBtn.addActionListener(entreeLsnr);
        dessertBtn.addActionListener(dessertLsnr);
        fountainBtn.addActionListener(fountainLsnr);
        alcoholBtn.addActionListener(alcoholLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerAppetizer implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Appetizers appetizer = new Appetizers();
            appetizer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            appetizer.setVisible(true);
        }
    }
    
    public class ClickListenerEntree implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Entrees entree = new Entrees();
            entree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            entree.setVisible(true);
        }
    }
    
    public class ClickListenerDessert implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Desserts dessert = new Desserts();
            dessert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dessert.setVisible(true);
        }
    }
    
    public class ClickListenerFountain implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Fountain fountain = new Fountain();
        	fountain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	fountain.setVisible(true);
        }
    }
    
    public class ClickListenerAlcohol implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Alcohol alcohol = new Alcohol();
        	alcohol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	alcohol.setVisible(true);
        }
    }
    
    public class ClickListenerBack implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFirst menu = new MenuFirst();
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setVisible(true);
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
