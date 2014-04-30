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


public class Fountain extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 470;
    int i;
    private String currentMenu;
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Fountain Drinks");
    JButton cokeBtn = new JButton("Coke");
    JButton spriteBtn = new JButton("Sprite");
    JButton teaBtn = new JButton("Sweet Tea");
    JButton dCokeBtn = new JButton("Diet Coke");
    JButton pibBtn = new JButton("Mr.Pib");
    JButton lemonadeBtn = new JButton("Lemonade");
    JButton beerBtn = new JButton("Root Beer");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener cokeLsnr = new ClickListenerCoke();
    ActionListener spriteLsnr = new ClickListenerSprite();
    ActionListener teaLsnr = new ClickListenerTea();
    ActionListener dCokeLsnr = new ClickListenerDCoke();
    ActionListener pibLsnr = new ClickListenerPib();
    ActionListener lemonadeLsnr = new ClickListenerLemonade();
    ActionListener beerLsnr = new ClickListenerBeer();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Fountain()
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
        setTitle("Fountain Drinks");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(cokeBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(spriteBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(teaBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(dCokeBtn, c);

        c.gridx = 1; c.gridy = 2;
        mainPanel.add(pibBtn, c);
        
        c.gridx = 2; c.gridy = 2;
        mainPanel.add(lemonadeBtn, c);

        c.gridx = 1; c.gridy = 3;
        mainPanel.add(beerBtn, c);
        
        c.gridx = 0; c.gridy = 4;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 4;
        mainPanel.add(cancelBtn, c);

        
        cokeBtn.addActionListener(cokeLsnr);
        spriteBtn.addActionListener(spriteLsnr);
        teaBtn.addActionListener(teaLsnr);
        dCokeBtn.addActionListener(dCokeLsnr);
        pibBtn.addActionListener(pibLsnr);
        lemonadeBtn.addActionListener(lemonadeLsnr);
        beerBtn.addActionListener(beerLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerCoke implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerSprite implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerTea implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerDCoke implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerPib implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerLemonade implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerBeer implements ActionListener
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

