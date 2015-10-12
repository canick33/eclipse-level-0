package level0;

import javax.swing.*;
import java.util.Scanner;

public class PhotoBook {
	JFrame frame;
	ImagePanel ip;
 public static void main (String[] args)
 {
	 Scanner reader = new Scanner(System.in);
	 PhotoBook p = new PhotoBook();


 }
 
public PhotoBook()
	 {
		JFrame frame = new JFrame(); 
		frame.setVisible(true);
		frame.setSize(500,500);
		 ip = new ImagePanel("imgres.jpg",2000,1000);
		 frame.add(ip);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
 
}
