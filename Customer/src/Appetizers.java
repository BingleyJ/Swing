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

public class Appetizers extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    private String currentMenu = "app";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Appetizers");
    JButton onionBtn = new JButton("Onion Rings");
    JButton wingsBtn = new JButton("Wings");
    JButton artichokeBtn = new JButton("Artichoke Dip");
    JButton chipsBtn = new JButton("Chips & Salsa");
    JButton quesadillaBtn = new JButton("Quesadillas");
    JButton mozzarellaBtn = new JButton("Mozarella Sticks");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener onionLsnr = new ClickListenerOnion();
    ActionListener wingsLsnr = new ClickListenerWings();
    ActionListener artichokeLsnr = new ClickListenerArtichoke();
    ActionListener chipsLsnr = new ClickListenerChips();
    ActionListener quesadillaLsnr = new ClickListenerQuesadilla();
    ActionListener mozzarellaLsnr = new ClickListenerMozzarella();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Appetizers()
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
        mainPanel.add(onionBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(wingsBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(artichokeBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(chipsBtn, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(quesadillaBtn, c);

        c.gridx = 2; c.gridy = 2;
        mainPanel.add(mozzarellaBtn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        
        onionBtn.addActionListener(onionLsnr);
        wingsBtn.addActionListener(wingsLsnr);
        artichokeBtn.addActionListener(artichokeLsnr);
        chipsBtn.addActionListener(chipsLsnr);
        quesadillaBtn.addActionListener(quesadillaLsnr);
        mozzarellaBtn.addActionListener(mozzarellaLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerOnion implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerWings implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerArtichoke implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerChips implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerQuesadilla implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerMozzarella implements ActionListener
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

