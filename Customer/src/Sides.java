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


public class Sides extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 470;
    private String currentMenu = "sides";
    private String prevMenu = "";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Sides");
    JButton continueBtn = new JButton ("Continue");
    JButton backBtn = new JButton ("Back");
    JButton cancelBtn = new JButton ("Cancel");
    JCheckBox potatoCBX = new JCheckBox("Loaded Mash Potatoes");
    JCheckBox riceCBX = new JCheckBox("Rice");
    JCheckBox breadCBX = new JCheckBox("Garlic Bread");
    JCheckBox gBeansCBX = new JCheckBox("Green Beans");
    JCheckBox brocolliCBX = new JCheckBox("Brocolli");
    JCheckBox applesCBX = new JCheckBox("Cinamon Apples");
    JCheckBox cornCBX = new JCheckBox("Corn");
    JCheckBox macaroniCBX = new JCheckBox("Macaroni & Cheese");
    JCheckBox carrotsCBX = new JCheckBox("Sweet Carrots");
    JCheckBox friesCBX = new JCheckBox("Curly Fries");
    JCheckBox bBeansCBX = new JCheckBox("Black Beans");
    JCheckBox saladCBX = new JCheckBox("Side Salad");

    ActionListener continueLsnr = new ClickListenerContinue();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Sides()
    {
        format();
        addLogo();
    }
    
    public Sides(String prev)
    {
    	prevMenu = prev;
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
        setTitle("Side");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(riceCBX, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(potatoCBX, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(breadCBX, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(gBeansCBX, c);

        c.gridx = 1; c.gridy = 2;
        mainPanel.add(brocolliCBX, c);
        
        c.gridx = 2; c.gridy = 2;
        mainPanel.add(applesCBX, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(cornCBX, c);

        c.gridx = 1; c.gridy = 3;
        mainPanel.add(macaroniCBX, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(carrotsCBX, c);
        
        c.gridx = 0; c.gridy = 4;
        mainPanel.add(friesCBX, c);
        
        c.gridx = 1; c.gridy = 4;
        mainPanel.add(bBeansCBX, c);
        
        c.gridx = 2; c.gridy = 4;
        mainPanel.add(saladCBX, c);

        c.gridx = 1; c.gridy = 5;
        mainPanel.add(continueBtn, c);
        
        c.gridx = 0; c.gridy = 5;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 5;
        mainPanel.add(cancelBtn, c);

        continueBtn.addActionListener(continueLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    public class ClickListenerContinue implements ActionListener
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