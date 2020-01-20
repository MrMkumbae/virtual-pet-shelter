package virtualPetShelterExerc;

import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {
List<VirtualPet> pets = new ArrayList<>();
	
	public void addVirtualPet(VirtualPet pet) {
		pets.add(pet);
	}
	
	public int getListSize() {
		return pets.size();
	}
	
	//String water;
	
	public void feedAll() {
		for(VirtualPet pet: pets) {
			pet.feed();
		}
	}
	
	public void waterAll() {
		for(VirtualPet pet: pets) { 
			pet.water(); 
		}
	}
	
	public void playWithPet(String petName) {
		for(VirtualPet pet: pets) {
			if (pet.getName().equals(petName)) {
				pet.play();
			}
		}
	}
	
	public void adopt(String pet) {
		VirtualPet thePet = getPet(pet);
		pets.remove(thePet);
	}
	
	public VirtualPet getPet(String name) {
		int i = 0;
		int index = 0;
		for(VirtualPet pet: pets) {
			if (pet.getName().equals(name)) {
				index = i;
			}
			i++;
		}
		return pets.get(index);
	}
	
	public void tick() {
		for(VirtualPet pet: pets) {
			pet.tick();
		}
	}
	
	public void displayTwo() {
		for(VirtualPet pet: pets) {
			System.out.println("[" + pet.getName() + "] " + pet.getDescription());
		}
	}
	
	public void displayAll() {
		for(VirtualPet pet: pets) {
			System.out.println(pet.getName() + "\t |" + pet.getHunger() + "\t |" + pet.getThirst() + "\t |" + pet.getBoredom());
		 }
	}
	
}
