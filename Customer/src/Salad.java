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


public class Salad extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 470;
    private String currentMenu = "salad";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Salad Toppings");
    JButton continueBtn = new JButton ("Continue");
    JButton backBtn = new JButton ("Back");
    JButton cancelBtn = new JButton ("Cancel");
    JCheckBox cheeseCBX = new JCheckBox("Cheese");
    JCheckBox tomatoCBX = new JCheckBox("Tomato");
    JCheckBox ranchCBX = new JCheckBox("Ranch Dressing");
    JCheckBox islandCBX = new JCheckBox("Thousand Island Dressing");
    JCheckBox crutonsCBX = new JCheckBox("Crutons");
    JCheckBox mushroomCBX = new JCheckBox("Mushroom");
    JCheckBox cucumberCBX = new JCheckBox("Cucumber");
    JCheckBox frenchCBX = new JCheckBox("French Dressing");
    JCheckBox baconCBX = new JCheckBox("Bacon Bits");
    JCheckBox olivesCBX = new JCheckBox("Olives");
    JCheckBox carrotCBX = new JCheckBox("Carrots");
    JCheckBox italianCBX = new JCheckBox("Italian Dressing");

    ActionListener continueLsnr = new ClickListenerContinue();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Salad()
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
        setTitle("Salad Toppings");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(cheeseCBX, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(tomatoCBX, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(ranchCBX, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(crutonsCBX, c);

        c.gridx = 1; c.gridy = 2;
        mainPanel.add(mushroomCBX, c);
        
        c.gridx = 2; c.gridy = 2;
        mainPanel.add(islandCBX, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(cucumberCBX, c);

        c.gridx = 1; c.gridy = 3;
        mainPanel.add(baconCBX, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(frenchCBX, c);
        
        c.gridx = 0; c.gridy = 4;
        mainPanel.add(olivesCBX, c);
        
        c.gridx = 1; c.gridy = 4;
        mainPanel.add(carrotCBX, c);
        
        c.gridx = 2; c.gridy = 4;
        mainPanel.add(italianCBX, c);

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