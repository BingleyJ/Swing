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


public class Entrees extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 470;
    private String currentMenu = "entree";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Entrees");
    JButton soupsBtn = new JButton("Soups");
    JButton sandwichesBtn = new JButton("Sandwiches");
    JButton burgerBtn = new JButton("Platupus Burgers");
    JButton chickenBtn = new JButton("Chicken");
    JButton steaksBtn = new JButton("Steaks");
    JButton pastasBtn = new JButton("Pastas");
    JButton saladsBtn = new JButton("Large Salads");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener soupsLsnr = new ClickListenerSoups();
    ActionListener sandwichesLsnr = new ClickListenerSandwiches();
    ActionListener burgerLsnr = new ClickListenerBurger();
    ActionListener chickenLsnr = new ClickListenerChicken();
    ActionListener steaksLsnr = new ClickListenerSteaks();
    ActionListener pastasLsnr = new ClickListenerPastas();
    ActionListener saladsLsnr = new ClickListenerSalads();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Entrees()
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
        setTitle("Entrees");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(soupsBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(sandwichesBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(burgerBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(chickenBtn, c);

        c.gridx = 1; c.gridy = 2;
        mainPanel.add(steaksBtn, c);
        
        c.gridx = 2; c.gridy = 2;
        mainPanel.add(pastasBtn, c);

        c.gridx = 1; c.gridy = 3;
        mainPanel.add(saladsBtn, c);
        
        c.gridx = 0; c.gridy = 4;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 4;
        mainPanel.add(cancelBtn, c);

        
        soupsBtn.addActionListener(soupsLsnr);
        sandwichesBtn.addActionListener(sandwichesLsnr);
        burgerBtn.addActionListener(burgerLsnr);
        chickenBtn.addActionListener(chickenLsnr);
        steaksBtn.addActionListener(steaksLsnr);
        pastasBtn.addActionListener(pastasLsnr);
        saladsBtn.addActionListener(saladsLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerSoups implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Soups soup = new Soups();
            soup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            soup.setVisible(true);
        }
    }
    
    public class ClickListenerSandwiches implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            SandwichMeats sandwich = new SandwichMeats();
            sandwich.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            sandwich.setVisible(true);
        }
    }
    
    public class ClickListenerBurger implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Burgers burger = new Burgers();
            burger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            burger.setVisible(true);
        }
    }
    
    public class ClickListenerChicken implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Chicken chicken = new Chicken();
            chicken.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            chicken.setVisible(true);
        }
    }
    
    public class ClickListenerSteaks implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Steak steak = new Steak();
            steak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            steak.setVisible(true);
        }
    }
    
    public class ClickListenerPastas implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Pasta pasta = new Pasta();
            pasta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pasta.setVisible(true);
        }
    }
    
    public class ClickListenerSalads implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
            Sandwich sandwich = new Sandwich();
            sandwich.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            sandwich.setVisible(true);
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


