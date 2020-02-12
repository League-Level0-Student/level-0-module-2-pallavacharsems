package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollerCoaster {
public static void main(String[] args) {
	


String j = JOptionPane.showInputDialog("How many inches tall are you?");

int num = Integer.parseInt(j);

if(num<48) {
	JOptionPane.showMessageDialog(null, "You can't go on this roller coaster!");
	
} else {
	JOptionPane.showMessageDialog(null, "You can go on this roller coaster!");
}





















}
}
