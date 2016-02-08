package level0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class StringFUN implements ActionListener {
JFrame frame;
JPanel panel;
JTextField textfield;
JTextField textfield2;
JButton button;

 public static void main (String[] args) {
  StringFUN construct = new StringFUN();
 }
 StringFUN()
 {
	 frame = new JFrame();
	 panel = new JPanel();
	 textfield = new JTextField("enter");
	 textfield2 = new JTextField("output");
	 button = new JButton("T");
	 frame.add(panel);
	 panel.add(textfield);
	 panel.add(textfield2);
	 panel.add(button);
	 button.addActionListener(this);
	 
	 
 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String x = textfield.getText();
	StringBuilder sb = new StringBuilder(x);
	sb.setCharAt(0,"");
	
	int sl = (x.length());
	char first = x.charAt(0);
	String ending = "" +  first;
	ending += "a";
	x += "" + ending;
	
	
	
	
	
	
}
}
