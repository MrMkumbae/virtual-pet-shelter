package virtualPetShelterExerc;

import java.util.Scanner;

public class VirtualPetShelterApp {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 String petName;
			
		 VirtualPetShelter columbus = new VirtualPetShelter();
		 
		 columbus.addVirtualPet(new VirtualPet("Joey", "looks like he's seen better days.", 83, 34, 23));
		 columbus.addVirtualPet(new VirtualPet("Johnny", "is a bit nervous.", 69, 49, 2));
		 columbus.addVirtualPet(new VirtualPet("Dee dee", "probably didn't start with that many legs", 39, 18, 88));
		 columbus.addVirtualPet(new VirtualPet("Tommy", "smells like a Stargazer lily fresh with morning dew", 59, 19, 37));
		 
		 int choice;

		 System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!");
		 System.out.println("");
		 System.out.println("This is the status of your pets");
		 System.out.println("");
			
		 System.out.println("  Name   |Hunger |Thirst |Boredom ");
		 System.out.println("-------- |------ |------ |------ ");
		 columbus.displayAll();
		 
		 do {
			 
			 System.out.println("");
			 System.out.println("What would you like to do next?");
			 System.out.println("");
				
			 System.out.println("1. Feed the pets");
			 System.out.println("2. Water the pets");
			 System.out.println("3. Play with a pet");
			 System.out.println("4. Adopt a pet");
			 System.out.println("5. Admit a pet");
			 System.out.println("6. Quit");
			 System.out.println("");
				
			 choice = input.nextInt();
			 System.out.println("");
				
				
			 if(choice == 1) {
				 System.out.println("You feed all the pets");
				 columbus.feedAll();
			 }
				
			 else if(choice == 2) {
				 System.out.println("You watered all the pets");
				 columbus.waterAll();
			 }
				
			 else if(choice == 3) {
				 System.out.println("Ok, so you'd like to play with a pet. PLease choose one:");
				 System.out.println("");
				 columbus.displayTwo();
				 System.out.println("");
				 System.out.println("Which pet would you like to play with?");
				 input.nextLine();
				 petName = input.nextLine();
				 columbus.playWithPet(petName);
				 System.out.println("Ok, you play with " + petName);
				 
			 }
				
			 else if(choice == 4) {
				 System.out.println("Which pet would you like to adopt?");
				 System.out.println("");
				 columbus.displayTwo();
				 System.out.println("");
				 input.nextLine();
				 petName = input.nextLine();
				 columbus.adopt(petName);
			 }
				
			 else if(choice == 5) {
				 System.out.println("Please Enter the pet's information at minimum the pet's name and description.");
				 System.out.println("Enter the pets name");
				 input.nextLine();
				 String name = input.nextLine(); 
				 System.out.println("");
				 System.out.println("Enter the pets description");
				 String description = input.nextLine(); 
				 System.out.println("");
				 
				 System.out.println("Do you want to enter extra information. Enter y/Y for Yes.");
				 String option = input.nextLine();
				 System.out.println("");
				 
				 if(option.equals("y") || option.equals("Y")) {
					 System.out.println("Enter the pets hunger");
					 int hunger = input.nextInt(); 
					 System.out.println("");
					 
					 System.out.println("Enter the pets thirst");
					 int thirst = input.nextInt(); 
					 System.out.println("");
					 
					 System.out.println("Enter the pets boredom");
					 int boredom = input.nextInt(); 
					 System.out.println("");
					 
					 columbus.addVirtualPet(new VirtualPet(name, description, hunger, thirst, boredom));	
				 }
				 
				 else
				 {
					 columbus.addVirtualPet(new VirtualPet(name, description));
				 }
				 
				 System.out.println(""); 
			 }
				
			 else if(choice == 6) {
				 System.out.println("Quit");
				 System.out.println("");
			 }
				
			 else {
				 System.out.println("Please enter between 1 and 6");
			 }
				
			 System.out.println("");
			 System.out.println("********** Tick Update **********");
			 columbus.tick();
			 System.out.println("  Name   |Hunger |Thirst |Boredom ");
			 System.out.println("-------- |------ |------ |------ ");
			 columbus.displayAll();
			 System.out.println("*********************************");
			 
			 
		 	} while (choice != 6); 

	}

}