package level0;

import java.awt.Graphics;

import javax.swing.*;

public class PhotoBook {
	JFrame frame;
 BackgroundPanel  ip;
 public static void main (String[] args)
 {
	 PhotoBook p = new PhotoBook();


 }
 
public PhotoBook()
	 {
		JFrame frame = new JFrame(); 
		frame.setVisible(true);
		 ip = new BackgroundPanel();
		 frame.add(ip);
		frame.setSize(500,500);

		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
 
}
