import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BinaryConvert implements ActionListener{
	
	JFrame Background;
	JTextField entered;
	JTextField output;
	JPanel panel;
	JButton button;
	String x;
	int num, anwser;
	
	public static void main (String[] args)
	{
		BinaryConvert b = new BinaryConvert();}
	
	BinaryConvert()
	{
		Background = new JFrame();
		Background.setVisible(true);
		Background.setSize(500,500);
		panel = new JPanel();
		entered = new JTextField(15);
		output = new JTextField(15);
		button = new JButton("Convert");
		button.addActionListener(this);
		panel.add(button);
		panel.add(entered);
		panel.add(output);
		output.setText("" + anwser);
		Background.add(panel);
		Background.pack();


		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = 0;
		int z= 1;
		num = 0;
		output.setText("" + anwser);
		x = entered.getText();
		num = Integer.parseInt(x);
		while(i<1)
		{
			
			z = (num%2);
			
			if (z==1)
			{
				anwser = (anwser*10 + 1);
				num = (num/2);
			}
			else
			{
				anwser = anwser*10;
				num = (num/2);
			}
			if(num<1)
			{ 
				i=2;
			}

			
		}

		output.setText("" + anwser);
		
	}

}





