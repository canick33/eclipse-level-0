

	// Copyright The League of Amazing Programmers 2014
	import javax.swing.JOptionPane;

	/*
	 * I have a pocket full of change. I hate doing math. Make me a program that
	 * will calculate how much money I have without me having to use my brain. Then
	 * make me a sandwich.
	 */
	public class ChangeCalculator {

		public static void main(String[] args) {
			Double P,N,D,Q,TOTAL;
			String Penny,Nickle,Dime,Quarter;
			Penny= JOptionPane.showInputDialog("ENTER Pennies");
			P = Double.parseDouble(Penny);
			
			Nickle= JOptionPane.showInputDialog("ENTER Nickles");
			N = Double.parseDouble(Nickle);
			
			Dime= JOptionPane.showInputDialog("ENTER Dimes");
			D = Double.parseDouble(Dime);
			
			Quarter= JOptionPane.showInputDialog("ENTER Quarters");
			Q = Double.parseDouble(Quarter);
			
			TOTAL = ((P/100)+(N/20)+ (D/10) + (Q/4));
			JOptionPane.showMessageDialog(null, "you have "+TOTAL + "DOLLARS");
			
		}
	}




