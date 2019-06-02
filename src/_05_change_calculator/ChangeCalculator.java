package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String x = JOptionPane.showInputDialog("How many Nickels do you have?");
		// Convert their answer to an it using Integer.parseInt()
int nickels = Integer.parseInt(x);
		// Ask the user how many dimes they have, and convert their answer
String y = JOptionPane.showInputDialog("How many Dimes do you have?");
int dimes = Integer.parseInt(y);
		// Ask the user how many quarters they have, and convert their answer
String xy = JOptionPane.showInputDialog("How many Quarters do you have?");
int quarters = Integer.parseInt(xy);
		// Calculate how much money the user has and save it in a double variable 

double nickel = nickels*.05;
double dime = dimes*.10;
double quarter = quarters*.25;
double total = nickel+dime+quarter;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, total);
	}
}

