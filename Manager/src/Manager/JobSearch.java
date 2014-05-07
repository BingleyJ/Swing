package Manager;

import javax.swing.*;

import org.sqlite.SQLite;

import java.awt.*;
import java.awt.event.*;

public class JobSearch extends JDialog 
{
    //Create components
    GridBagConstraints c = new GridBagConstraints();
    
    private final int width = 300;
    private final int height = 150;
    
    JPanel panel = new JPanel(new GridBagLayout());

    SQLiteJDBC database = new SQLiteJDBC();
    String[] userInfo = new String[5];

    JLabel name_Lbl = new JLabel("Name : ");
    JLabel nameLbl = new JLabel();
    JLabel job_Lbl = new JLabel("Job : ");
    JLabel jobLbl = new JLabel();
    JLabel password_Lbl = new JLabel("Password : ");
    JLabel passwordLbl = new JLabel();

    JButton okBtn = new JButton("OK"); 
    ActionListener okLsnr = new ClkLsnrOk();
    
    
    
    public JobSearch (String inJob)
    {
    	
    	userInfo = database.jobSearch(inJob);
        nameLbl.setText(userInfo[0]);
    	jobLbl.setText(userInfo[1]);
    	passwordLbl.setText(userInfo[2]);  
        format();
    }
    

    private void format()
    {
        setTitle("Search Results");
        setSize(width, height);
        setResizable(false);
        setModal(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        c.insets = new Insets(5, 5, 5, 5);
        
        c.gridx = 0; c.gridy = 0;
        panel.add(name_Lbl, c);
        
        c.gridx = 1; c.gridy = 0;
        panel.add(nameLbl, c);
        
        c.gridx = 0; c.gridy = 1;
        panel.add(job_Lbl, c);
        
        c.gridx = 1; c.gridy = 1;
        panel.add(jobLbl, c);
        
        c.gridx = 0; c.gridy = 2;
        panel.add(password_Lbl, c);
        
        c.gridx = 1; c.gridy = 2;
        panel.add(passwordLbl, c);

        
        c.gridx = 1; c.gridy = 3;
        panel.add(okBtn, c);
        okBtn.addActionListener(okLsnr);
        
        add(panel, BorderLayout.CENTER);
    }
    
    public class ClkLsnrOk implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            setVisible(false);
            dispose();
        }
    }
}

