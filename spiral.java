package level0;
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;
import java.util.Scanner;

public class spiral {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int userImput=0;
		int sides =0;
		
		int i;
		System.out.println("how many sides");
		sides = reader.nextInt();
	
		Tortoise.setSpeed(10);
		for(i=0; i<sides;i++ )
		{
		 Tortoise.move(i);
		 Tortoise.turn(10);
		}
		
	}

}


