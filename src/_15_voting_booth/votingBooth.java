package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	
	String h = JOptionPane.showInputDialog("How old are you (in years)!");
	int n = Integer.parseInt(h);
	if(n<18) {
	JOptionPane.showMessageDialog(null, "You can't vote yet:(");
	} else {
		JOptionPane.showMessageDialog (null, "Who do you think should be president next!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
