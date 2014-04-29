import javax.swing.*;

import java.awt.List;
import java.util.Scanner;

public class kitchenMain 
{

	public static void main(String[] args) 
	{
		int x = 1;
		kitchen Kitchen = new kitchen();
		Kitchen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Kitchen.setVisible(true);
        while(true)	//keeps looping to receive orders
        {
        	Scanner input = new Scanner(System.in);	//currently recieving orders from console 
        	String order = input.nextLine(); 
        	kitchen.order(order, x);
        	x++;
        }
	}

}
