package Manager;

import javax.swing.*;

import org.sqlite.SQLite;

import java.awt.*;
import java.awt.event.*;

public class NameSearch extends JDialog 
{
    //Create components
    GridBagConstraints c = new GridBagConstraints();
    
    private final int width = 800;
    private final int height = 400;
    
    JPanel panel = new JPanel(new GridBagLayout());

    SQLiteJDBC database = new SQLiteJDBC();
    String[] userInfo = new String[5];

    
    JLabel nameLbl = new JLabel();
    JLabel jobLbl = new JLabel();
    JLabel passwordLbl = new JLabel();

    JButton okBtn = new JButton("OK"); 
    ActionListener okLsnr = new ClkLsnrOk();
    
    
    
    public NameSearch (String inName)
    {
    	
    	userInfo = database.nameSearch(inName);
        nameLbl.setText(userInfo[0]);
    	jobLbl.setText(userInfo[1]);
    	passwordLbl.setText(userInfo[2]);
    
        format();
    }
    

    
    private void format()
    {
        setTitle("Error");
        setSize(width, height);
        setResizable(false);
        setModal(true);
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 0;
        panel.add(nameLbl, c);
        
        c.gridx = 1; c.gridy = 0;
        panel.add(jobLbl, c);
        
        c.gridx = 2; c.gridy = 0;
        panel.add(passwordLbl, c);

        
        c.gridx = 1; c.gridy = 2;
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

