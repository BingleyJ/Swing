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


public class Desserts extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    private String currentMenu = "desserts";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Desserts");
    JButton floatBtn = new JButton("Root Beer Float");
    JButton lavaBtn = new JButton("Molten Lava Cake");
    JButton appleBtn = new JButton("Apple Pie");
    JButton brownieBtn = new JButton("Brownie Sundae");
    JButton cookieBtn = new JButton("Fried Chocolate Chip Cookie");
    JButton cheeseBtn = new JButton("Strawberry Cheese Cake");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener floatLsnr = new ClickListenerFloat();
    ActionListener lavaLsnr = new ClickListenerLava();
    ActionListener appleLsnr = new ClickListenerApple();
    ActionListener brownieLsnr = new ClickListenerBrownie();
    ActionListener cookieLsnr = new ClickListenerCookie();
    ActionListener cheeseLsnr = new ClickListenerCheese();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //ConstructorB
    public Desserts()
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
        
        c.insets = new Insets (15,30,15,30);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(floatBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(lavaBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(appleBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(brownieBtn, c);

        c.gridx = 1; c.gridy = 2;
        mainPanel.add(cookieBtn, c);
        
        c.gridx = 2; c.gridy = 2;
        mainPanel.add(cheeseBtn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        
        floatBtn.addActionListener(floatLsnr);
        lavaBtn.addActionListener(lavaLsnr);
        appleBtn.addActionListener(appleLsnr);
        brownieBtn.addActionListener(brownieLsnr);
        cookieBtn.addActionListener(cookieLsnr);
        cheeseBtn.addActionListener(cheeseLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerFloat implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerLava implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerApple implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerBrownie implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerCookie implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerCheese implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerBack implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuSetup menu = new MenuSetup();
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
