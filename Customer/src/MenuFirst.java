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


public class MenuFirst extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();
    
    JButton orderBtn = new JButton("Order");
    JButton rateBtn = new JButton("Rate You Experiance");
    JButton helpBtn = new JButton("Request Help");
    JButton managerBtn = new JButton("Request Manager");
    
    ActionListener orderLsnr = new ClickListenerOrder();
    ActionListener rateLsnr = new ClickListenerRate();
    ActionListener helpLsnr = new ClickListenerHelp();
    ActionListener managerLsnr = new ClickListenerManager();

    //Constructor
    public MenuFirst()
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
        setTitle("Final Menu");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (15,15,15,15);

        c.gridx = 2; c.gridy = 0;
        mainPanel.add(orderBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(rateBtn, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(helpBtn, c);
        
        c.gridx = 3; c.gridy = 2;
        mainPanel.add(managerBtn, c);

        orderBtn.addActionListener(orderLsnr);
        rateBtn.addActionListener(rateLsnr);
        helpBtn.addActionListener(helpLsnr);
        managerBtn.addActionListener(managerLsnr);
        
        add(mainPanel, BorderLayout.CENTER);
    }
    
    //Listener for the Login button
    public class ClickListenerOrder implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuSetup menu = new MenuSetup();
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setVisible(true);
        }
    }
    
    public class ClickListenerRate implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	
        }
    }
    
    public class ClickListenerHelp implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

        }
    }
    
    public class ClickListenerManager implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

        }
    }
}