//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random randomMaker = new Random();
	
	int randomNumber = randomMaker.nextInt(4);
	
	
	// 3. Print out this variable
	System.out.println(randomNumber);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Pick a number 0-3");
	// 5. If the random number is 0
if(randomNumber==0) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Yes");
}
	// 6. If the random number is 1
	if(randomNumber==1) {
	// -- tell the user "No"
		JOptionPane.showMessageDialog(null, "No");
	}
		// 7. If the random number is 2
		if(randomNumber==2) {
	// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
		}
			// 8. If the random number is 3
			if(randomNumber==3) {
			
				// -- write your own answer
		JOptionPane.showMessageDialog(null, "Bruh, you are 1,00000000000000000000000000000000000000000000 away from the answer!");
}
}
}


