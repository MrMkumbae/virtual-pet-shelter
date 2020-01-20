package virtualPetShelterExerc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VirtualPetShelterTest {
	
	VirtualPetShelter ohio = new VirtualPetShelter();

	@Test
	void shouldGetPet() {
		VirtualPet cinci = new VirtualPet("Joey", "looks like he's seen better days.", 83, 34, 23);
		VirtualPet toledo = new VirtualPet("Johnny", "is a bit nervous.", 69, 49, 2);
		
		ohio.addVirtualPet(cinci);
		ohio.addVirtualPet(toledo);
		
		VirtualPet holder = ohio.getPet(cinci.getName());
		
		assertEquals(cinci, holder);
	}
	
	@Test
	void shouldFeedAllPets() {
		VirtualPet cinci = new VirtualPet("Joey", "looks like he's seen better days.", 83, 34, 23);
		VirtualPet toledo = new VirtualPet("Johnny", "is a bit nervous.", 69, 49, 2);
		
		ohio.addVirtualPet(cinci);
		ohio.addVirtualPet(toledo);
		
		ohio.feedAll(); //Reduce hunger for all by 10
		
		assertEquals(73, cinci.getHunger()); //Hunger reduced by 10
		assertEquals(59, toledo.getHunger()); //Hunger reduced by 10
	}
	
	@Test
	void shouldWaterAllPets() {
		VirtualPet cinci = new VirtualPet("Joey", "looks like he's seen better days.", 83, 34, 23);
		VirtualPet toledo = new VirtualPet("Johnny", "is a bit nervous.", 69, 49, 2);
		
		ohio.addVirtualPet(cinci);
		ohio.addVirtualPet(toledo);
		
		ohio.waterAll(); //Reduce thirst for all by 15
		
		assertEquals(19, cinci.getThirst()); //Thirst reduced by 15
		assertEquals(34, toledo.getThirst()); //Thirst reduced by 15
	}
	
	@Test
	void shouldPlayWithPet() {
		VirtualPet cinci = new VirtualPet("Joey", "looks like he's seen better days.", 83, 34, 23);
		VirtualPet toledo = new VirtualPet("Johnny", "is a bit nervous.", 69, 49, 2);
		
		ohio.addVirtualPet(cinci);
		ohio.addVirtualPet(toledo);
		
		ohio.playWithPet(cinci.getName()); //play with cinci
		
		assertEquals(10, cinci.getBoredom()); //Boredom reduced by 13
		assertEquals(2, toledo.getBoredom()); //Boredom value not changed  
	}
	
	@Test
	void shouldAdoptPet() {
		VirtualPet cinci = new VirtualPet("Joey", "looks like he's seen better days.", 83, 34, 23);
		VirtualPet toledo = new VirtualPet("Johnny", "is a bit nervous.", 69, 49, 2);
		
		ohio.addVirtualPet(cinci);
		ohio.addVirtualPet(toledo);
		
		ohio.adopt(cinci.getName());
		int size = ohio.getListSize();
		
		assertEquals(1, size); //size reduced from 2 to 1 because a pet was adopted
	}
	
	@Test
	void shouldAmitPet() {
		VirtualPet cinci = new VirtualPet("Joey", "looks like he's seen better days.", 83, 34, 23);
		VirtualPet toledo = new VirtualPet("Johnny", "is a bit nervous.", 69, 49, 2);
		
		ohio.addVirtualPet(cinci);
		ohio.addVirtualPet(toledo);
		
		ohio.addVirtualPet(new VirtualPet("Tom", "The beast"));
		int size = ohio.getListSize();
		
		assertEquals(3, size); //size increased by one because a new pet was admitted
	}
	

}

