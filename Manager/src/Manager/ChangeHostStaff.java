package Manager;

import javax.swing.*;

import Manager.ManagerMainMenu.ClickListenerHostStaff;

import java.awt.*;
import java.awt.event.*;

public class ChangeHostStaff extends JDialog 
{
    //Create components
    GridBagConstraints c = new GridBagConstraints();
    
    private final int width = 680;
    private final int height = 350;
    
    JPanel logoPanel = new JPanel();
    JPanel mainPanel = new JPanel(new GridBagLayout());

    JLabel logoLbl = new JLabel();
    JLabel hostLbl = new JLabel("Input Username:");
    JTextField hostFld = new JTextField(15);
    //added by jay DB
    JLabel jobLbl = new JLabel("Input Job Title:");
    JTextField jobFld = new JTextField(15);
    
    JLabel pwdLbl = new JLabel("Input Password:");
    JTextField pwdFld = new JTextField(15);
    
    JButton addBtn = new JButton("Add Staff To DB"); 
    
    
    //DB
    ActionListener addStaffLsnr = new ClickListenerAddStaff();

    
    public ChangeHostStaff ()
    {
        format();
        addLogo();
    }
    
    private void format()
    {
        setTitle("Add/Remove Host Staff");
        setSize(width, height);
        setResizable(false);
        setModal(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 0;
        mainPanel.add(hostLbl, c);
        
        c.gridx = 1; c.gridy = 0;
        mainPanel.add(hostFld, c);
        
        //ADDED BY DB
        c.gridx = 0; c.gridy = 1;
        mainPanel.add(jobLbl, c);
        
        c.gridx = 1; c.gridy = 1;
        mainPanel.add(jobFld, c);
        
        c.gridx = 0; c.gridy = 2;
        mainPanel.add(pwdLbl, c);
        
        c.gridx = 1; c.gridy = 2;
        mainPanel.add(pwdFld, c);
        //db
        
       
        c.gridx = 0; c.gridy = 3;
        mainPanel.add(addBtn, c);
        addBtn.addActionListener(addStaffLsnr);

       
        
        add(mainPanel, BorderLayout.CENTER);
    }
    
    private void addLogo()
    {
        logoLbl.setIcon(new ImageIcon("content\\logo.png"));
        logoPanel.add(logoLbl);
        
        add(logoPanel, BorderLayout.NORTH);
    }
    
    public class ClickListenerAddStaff implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            SQLiteJDBC database = new SQLiteJDBC();
            database.insertUser(hostFld.getText(), jobFld.getText(), pwdFld.getText());
            dispose();
        }
    }
}
