package level0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton spin;
	JTextField bet;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel total;
	int labelval1;
	int labelval2;
	int labelval3;
	int totalval;
	int betval;
	public static void main (String[] args)
	{
		SlotMachine s = new SlotMachine();
	}
	public SlotMachine()
	{
		frame = new JFrame();
		frame.setSize(500,200);
		frame.setVisible(true);
		panel = new JPanel();
		spin = new JButton("Spin");
		spin.addActionListener(this);
		bet = new JTextField("BET");
		label1 = new JLabel("0");
		label2 = new JLabel("0");
		label3 = new JLabel("0");
		total = new JLabel("1000");
		frame.add(panel);
		panel.add(spin);
		panel.add(bet);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(total);


		


		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String x = bet.getText();
		betval = Integer.parseInt(x);
		labelval1 = spin();
		labelval2 = spin();
		labelval3 = spin();
		if(labelval1 ==labelval3 && labelval2 ==labelval3)
		{
			totalval = betval*5;
		}
		else
		{
			totalval = totalval-betval;
		}

		label1.setText(""+ labelval1);
		label2.setText(""+ labelval2);
		label3.setText(""+ labelval3);
		total.setText(""+ totalval);

		
		
	}
	public int spin()
	{
		Random r = new Random();
		int x = r.nextInt(3);
		return x;
	}
}
