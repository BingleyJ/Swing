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

public class Pasta extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 410;
    private String currentMenu;
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Pastas");
    JButton alfredoBtn = new JButton("Chicken Alfredo");
    JButton lasagnaBtn = new JButton("Lasagna");
    JButton spaghettiBtn = new JButton("Spaghetti");
    JButton linguiniBtn = new JButton("Linguini");
    JButton rigatoniBtn = new JButton("Rigatoni");
    JButton saladBtn = new JButton("Tijuanna Pasta Salad");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener alfredoLsnr = new ClickListenerAlfredo();
    ActionListener lasagnaLsnr = new ClickListenerLasagna();
    ActionListener spaghettiLsnr = new ClickListenerSpaghetti();
    ActionListener linguiniLsnr = new ClickListenerLinguini();
    ActionListener rigatoniLsnr = new ClickListenerRigatoni();
    ActionListener saladLsnr = new ClickListenerSalad();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Pasta()
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
        setTitle("Pastas");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(alfredoBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(lasagnaBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(spaghettiBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(linguiniBtn, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(rigatoniBtn, c);

        c.gridx = 2; c.gridy = 2;
        mainPanel.add(saladBtn, c);
        
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 3;
        mainPanel.add(cancelBtn, c);

        
        alfredoBtn.addActionListener(alfredoLsnr);
        lasagnaBtn.addActionListener(lasagnaLsnr);
        spaghettiBtn.addActionListener(spaghettiLsnr);
        linguiniBtn.addActionListener(linguiniLsnr);
        rigatoniBtn.addActionListener(rigatoniLsnr);
        saladBtn.addActionListener(saladLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerAlfredo implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerLasagna implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerSpaghetti implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerLinguini implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerRigatoni implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	Sides sides = new Sides();
        	sides.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	sides.setVisible(true);
        }
    }
    
    public class ClickListenerSalad implements ActionListener
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
