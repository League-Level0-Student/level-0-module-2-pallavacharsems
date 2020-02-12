//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	public static void main(String[] args) {
			
		/* 1. Ask the user which animal they want, then play the sound of that animal. */			 
			String response = JOptionPane.showInputDialog("Which animal is your favorite animal!");
		/* 2. Make it so that the user can keep entering new animals. */
if (response.equalsIgnoreCase("Cow")) {
	playMoo();
	System.out.println("mooing");
}
else if(response.equalsIgnoreCase("Duck")) {	
	playQuack();
	System.out.println("Quacking");
	}
else if(response.equalsIgnoreCase("Dog")) {	
	playWoof();
	System.out.println("Barking");
}
	else if(response.equalsIgnoreCase("Cat")) {	
		playMeow();
		System.out.println("Meowing");
		}
	else if(response.equalsIgnoreCase("Llama")) {	
		playLlama();
		System.out.println("Llamaing");
		}
	
	
	
	
	
	
	
	
	
	
	
	}

	static void playMoo() {
		playNoise(mooFile);
	}

	static void playQuack() {
		playNoise(quackFile);
	}

	static void playWoof() {
		playNoise(woofFile);
	}
	
	static void playMeow() {
		playNoise(meowFile);
	}
	
	static void playLlama() {
		playNoise(llamaFile);
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}