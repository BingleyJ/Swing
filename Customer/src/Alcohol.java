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


public class Alcohol extends JFrame
{

	//Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 640;
    private final int height = 470;
    private String currentMenu = "alco";
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("Alcoholic Beverages");
    JButton screwBtn = new JButton("Screw Driver");
    JButton budBtn = new JButton("Bud Light");
    JButton pinaBtn = new JButton("Pina Colada");
    JButton teaBtn = new JButton("Long Island Ice Tea");
    JButton moscatoBtn = new JButton("Moscato");
    JButton margaritaBtn = new JButton("Margarita");
    JButton redBtn = new JButton("Sweet Red");
    JButton backBtn = new JButton("Back");
    JButton cancelBtn = new JButton("Cancel");
    
    
    ActionListener screwLsnr = new ClickListenerScrew();
    ActionListener budLsnr = new ClickListenerBud();
    ActionListener pinaLsnr = new ClickListenerPina();
    ActionListener teaLsnr = new ClickListenerTea();
    ActionListener moscatoLsnr = new ClickListenerMoscato();
    ActionListener margaritaLsnr = new ClickListenerMargarita();
    ActionListener redLsnr = new ClickListenerRed();
    ActionListener backLsnr = new ClickListenerBack();
    ActionListener cancelLsnr = new ClickListenerCancel();

    //Constructor
    public Alcohol()
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
        setTitle("Alcoholic Beverages");
        setSize(width, height);
        setResizable(false);
        
        c.insets = new Insets (30,45,30,45);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        c.insets = new Insets (15,45,15,45);
        
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(screwBtn, c);

        c.gridx = 1; c.gridy = 1;
        mainPanel.add(budBtn, c);
        
        c.gridx = 2; c.gridy = 1;
        mainPanel.add(pinaBtn, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(teaBtn, c);

        c.gridx = 1; c.gridy = 2;
        mainPanel.add(moscatoBtn, c);
        
        c.gridx = 2; c.gridy = 2;
        mainPanel.add(margaritaBtn, c);
        
        c.gridx = 1; c.gridy = 3;
        mainPanel.add(redBtn, c);
        
        c.gridx = 0; c.gridy = 4;
        mainPanel.add(backBtn, c);
        
        c.gridx = 2; c.gridy = 4;
        mainPanel.add(cancelBtn, c);

        
        screwBtn.addActionListener(screwLsnr);
        budBtn.addActionListener(budLsnr);
        pinaBtn.addActionListener(pinaLsnr);
        teaBtn.addActionListener(teaLsnr);
        moscatoBtn.addActionListener(moscatoLsnr);
        margaritaBtn.addActionListener(margaritaLsnr);
        redBtn.addActionListener(redLsnr);
        backBtn.addActionListener(backLsnr);
        cancelBtn.addActionListener(cancelLsnr);
        
        add(mainPanel, BorderLayout.SOUTH);
    }
    
    //Listener for the Login button
    public class ClickListenerScrew implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerBud implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerPina implements ActionListener
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
    
    public class ClickListenerMoscato implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerMargarita implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	dispose();
        	MenuFinal mFinal = new MenuFinal(currentMenu);
        	mFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	mFinal.setVisible(true);
        }
    }
    
    public class ClickListenerRed implements ActionListener
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
