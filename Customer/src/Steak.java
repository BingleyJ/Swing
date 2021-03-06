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

public class Steak extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    private String currentMenu;
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Steaks");
    JButton rare8Btn = new JButton("8 oz Medium Rare");
    JButton medium8Btn = new JButton("8 oz Medium");
    JButton well8Btn = new JButton("8 oz Well Done");
    JButton rare12Btn = new JButton("12 oz Medium Rare");
    JButton medium12Btn = new JButton("12 oz Medium");
    JButton well12Btn = new JButton("12 oz Well Done");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener rare8Lsnr = new ClickListenerRare8();
    ActionListener medium8Lsnr = new ClickListenerMedium8();
    ActionListener well8Lsnr = new ClickListenerWell8();
    ActionListener rare12Lsnr = new ClickListenerRare12();
    ActionListener medium12Lsnr = new ClickListenerMedium12();
    ActionListener well12Lsnr = new ClickListenerWell12();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Steak()
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
        setTitle("Steaks");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(rare8Btn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(medium8Btn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(well8Btn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(rare12Btn, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(medium12Btn, c);

        c.gridx = 2; c.gridy = 2;
        mainPanel.add(well12Btn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        
        rare8Btn.addActionListener(rare8Lsnr);
        medium8Btn.addActionListener(medium8Lsnr);
        well8Btn.addActionListener(well8Lsnr);
        rare12Btn.addActionListener(rare12Lsnr);
        medium12Btn.addActionListener(medium12Lsnr);
        well12Btn.addActionListener(well12Lsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerRare8 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerMedium8 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerWell8 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerRare12 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerMedium12 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerWell12 implements ActionListener
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