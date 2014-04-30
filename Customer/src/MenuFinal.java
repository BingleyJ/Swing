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


public class MenuFinal extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    private String previousMenu = "";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JButton addBtn = new JButton("Add Another Selection");
    JButton sendBtn = new JButton("Send Order In");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    ActionListener addLsnr = new ClickListenerAdd();
    ActionListener sendLsnr = new ClickListenerSend();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public MenuFinal(String prev)
    {
    	previousMenu = prev;
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
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 0;
        mainPanel.add(addBtn, c);

        c.gridx = 0; c.gridy = 1;
        mainPanel.add(sendBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(backBtn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        addBtn.addActionListener(addLsnr);
        sendBtn.addActionListener(sendLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerAdd implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuSetup menu = new MenuSetup();
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setVisible(true);
        }
    }
    
    public class ClickListenerSend implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	
        }
    }
    
    public class ClickListenerBack implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	if (previousMenu == "sides")
        	{
            	Sides menu = new Sides();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setVisible(true);
        	}
        	else if (previousMenu == "alco")
        	{
        		Alcohol menu = new Alcohol();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setVisible(true);
        	}
        	else if (previousMenu == "app")
        	{
        		Appetizers menu = new Appetizers();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setVisible(true);
        	}
        	else if (previousMenu == "salad")
        	{
        		Salad menu = new Salad();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setVisible(true);
        	}
        	else if (previousMenu == "desserts")
        	{
        		Desserts menu = new Desserts();
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setVisible(true);
        	}
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