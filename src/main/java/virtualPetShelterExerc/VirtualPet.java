package virtualPetShelterExerc;

public class VirtualPet {
	
	private int hunger;
	private int thirst;
	private int boredom;
	private String name;
	private String description;
	
	public int getHunger() {
		return hunger;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public int getBoredom() {
		return boredom;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom; 
		this.name = name;
		this.description = description;
	}
	
	public void feed() {
		hunger = hunger - 10;
		thirst = thirst + 8;
	}
	
	public void water() {
		thirst = thirst - 15;
		hunger = hunger - 2; 
	} 
	
	public void play() {
		boredom = boredom - 13;
		thirst = thirst + 5;
		hunger = hunger + 3;
	}
	
	public void tick() {
		hunger = hunger + 8;
		thirst = thirst + 9;
		boredom = boredom + 6;
	}

}
