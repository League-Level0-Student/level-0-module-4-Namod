package _09_pi_aloud;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {
public static void main(String[] args) {
	
	// 1. Make a main method and make sure your program can run

	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
String pi = "3.1415926535" ;
	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
System.out.println(pi.charAt(0));
System.out.println(pi.charAt(1));
	// 4. Print ALL the digits of of Pi (hint: use a loop)
for (int i = 0; i < pi.length(); i++) {
	System.out.println(pi.charAt(i));
	
	speak(pi.charAt(i));
	if(getInputFromUser()==pi.charAt(i)) {
		System.out.println("Correct");
		
}
	else {
		System.err.println("Incorrect");
	}
}

	// 5. Use the speak() method to speak all the digits of Pi.

	// [ADVANCED]

	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println
}
	private static char[] charAt(int i) {
	// TODO Auto-generated method stub
	return null;
}
	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


