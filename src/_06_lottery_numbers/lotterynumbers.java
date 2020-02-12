package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotterynumbers {
public static void main(String[] args) {
	
Random randomMaker = new Random();
	
	int randomNumber = randomMaker.nextInt(70);
	
	System.out.println(randomNumber);
Random randomMaker2 = new Random();
	
	int randomhi = randomMaker2.nextInt(70);
	
	System.out.println(randomhi);

Random randomMaker23 = new Random();
	
	int randomhi3 = randomMaker23.nextInt(70);
	
	System.out.println(randomhi3);
Random randomMaker234 = new Random();
	
	int randomhi34 = randomMaker234.nextInt(70);
	
	System.out.println(randomhi34);
Random randomMaker235 = new Random();
	
	int randomhi35 = randomMaker235.nextInt(70);
	
	System.out.println(randomhi35);
JOptionPane.showMessageDialog(null, "The numbers below make up my lottery ticket");

}
}
