package Manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QueryDB extends JDialog 
{
    
    //Create components
    GridBagConstraints c = new GridBagConstraints(); 
    
    private final int width = 800;
    private final int height = 720;
    public String username = "admin";        //Hardcoded default manager username
    public String password = "password";     //Hardcoded default manager password (Very secure)
    
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel logoPanel = new JPanel(); //The logo has its own panel

    JLabel logoLbl = new JLabel();  
    JLabel titleLbl = new JLabel("This is the Query screen");

    //Constructor
    public QueryDB()
    {
        addLogo();
        format();
    }
    
    //Adds the logo to the top of the frame
    private void addLogo()
    {
        logoLbl.setIcon(new ImageIcon("content\\logo.png"));
        logoPanel.add(logoLbl);
        
        add(logoPanel, BorderLayout.NORTH);
    }
 
    private void format()
    {
        setTitle("Database Query");
        setSize(width, height);
        setResizable(false);
        setModal(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 0;
        mainPanel.add(titleLbl, c);
        
        add(mainPanel, BorderLayout.CENTER);
    }
}