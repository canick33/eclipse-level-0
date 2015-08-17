import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class JLablesAndFonts implements ActionListener {
	JFrame window;
	JButton button1,button2,button3,button4,button5;
	JLabel label;
	JPanel panel;
	Font f;
	int FONTSIZE = 50;
	int NUM = 10;
	int switchColor;
	int rand;
	Color randColor;

	public static void main (String[] args)
	{
		new JLablesAndFonts();
	}
	JLablesAndFonts()
	{
		window = new JFrame();
		
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("ADD");
		button2 = new JButton("SUB");
		button3 = new JButton("COLOR");
		button4 = new JButton("SIZE UP");
		button5 = new JButton("SIZE DOWN");
		panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button5);
		window.add(panel);
		label = new JLabel( );
		panel.add(label);
		label.setText("" +NUM);
		f = new Font("Arial",Font.BOLD,FONTSIZE);
		label.setFont(f);
		label.setForeground(Color.BLUE);
		window.setSize(500,500);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);


	
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() ==button1)
		{
			NUM = NUM+1;
			label.setText("" +NUM);

		}
		if(e.getSource() ==button2)
		{
			NUM = NUM-1;
			label.setText("" +NUM);

		}
		if(e.getSource() ==button3)
		{
			 rand = new Random().nextInt(256);
			 randColor = new Color(new Random().nextInt(256),new Random().nextInt(256),new Random().nextInt(256));
			label.setForeground(randColor);
		}
		if(e.getSource() ==button4)
		{
			
			f = new Font("Arial",Font.BOLD,FONTSIZE+=5);
			label.setFont(f);
			
		}
		if(e.getSource() ==button5)
		{
			f = new Font("Arial",Font.BOLD, FONTSIZE-=5);
			label.setFont(f);

			
		}
	}

}
