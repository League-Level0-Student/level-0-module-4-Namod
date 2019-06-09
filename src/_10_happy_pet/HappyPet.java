package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel =0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		HappyPet dog=new HappyPet();
String pet = JOptionPane.showInputDialog(" What kind of pet do you wann buy? ");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while (happinessLevel < 25 ) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			String happy =JOptionPane.showInputDialog(" What do you want to do to make your"+ pet+" happy?(cuddle, food, water, take a walk, groom, clean up poop)");
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			if(happy.equals("cuddle")) {
			dog.cuddle();
			}
			else if (happy.equals("food")) {
				dog.food();
				}
			else if(happy.equals("cwater")) {
				dog.water();
				}
			else if(happy.equals("takeawalk")) {
				dog.takeawalk();
				}
			else if(happy.equals("groom")) {
				dog.groom();
				}
			else if(happy.equals("cleanuppoop")) {
					dog.cleanuppoop();
				}
			System.out.println(happinessLevel);
		}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	void cuddle() {
		 happinessLevel+=5;
		JOptionPane.showConfirmDialog(null, "Good");
	}
	void food() {
		 happinessLevel+=5;
		JOptionPane.showConfirmDialog(null, "Nice");
		
	}
	void water() {
		 happinessLevel+=5;
		JOptionPane.showConfirmDialog(null, "congrats");
		
	}
	void takeawalk() {
		 happinessLevel+=5;
				JOptionPane.showConfirmDialog(null, "good job");
		
		
		
	}
	void groom() {
		 happinessLevel+=5;
				JOptionPane.showConfirmDialog(null, "great");
	}
	
	void cleanuppoop() {
		 happinessLevel+=5;
		 JOptionPane.showConfirmDialog(null, "done");
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}