# virtual-pet-shelter


VirtualPet class
For this project I have five different instance variables, hunger, thirst, boredom, name and description in the virtual pet class.

Hunger determines how hungry the virtual pet is. The method feed() is called in order to feed the virtual pet.
Thirst determines how thirsty the virtual pet is. The method water() is called when the pet needs to be watered. 
Boredom determines how bored the virtual pet is and the method play() is called when the pet is bored and needs to play. 
Name stores the name of the virtual pet and the method getName() returns the name of the pet.
Description stores information about the pet and the method getDecription() returns information about the virtual pet.

When the method feed() is called, the hunger decreases but the thirst.
When the method water() is called, thirst and hunger decreases.
When the method play() is called, boredom decreases but thirst and hunger increases. 
The tick() method increases hunger, thirst. The tick() method is called after every iteration to express a change in time. 
VirtualPet class has 2 constructors. One takes in name, description, hunger, thirst and boredome while the other takes the name and description only.



VirtualPetShelter
This class stores virtual pets in a list (arraylist) called pets.

The addVirtualPet(Virtual Pet) method is used to add a virtual pet to the list.
The getListSize() method returns the size of the list.
feedAll() method feeds all the virtual pets in the pets list by calling the feed() method found in the virtualPet class.
wasterAll() method waters all the virtual pets in the pets list by calling the water() method found in the virtualPet class.
The playWithPet(String petName) method takes the name of the pet and searches for the pet in the list and when found, it calls the play() method in virtualPet class.
adoptPet(String pet) method takes the name of the pet that a user wants to adopt, finds it in the list and removes it from the list.
getPet(String name) method takes in the name of the pet, looks for it in the list and returns the virtual pet.
tick() method calls the tick method in VirtualPet class for all the virtual pets in the pets list.
displayTwo() method displays the name and description of the virtual pet
displayAll() method displays the name, hunger, thirst and boredom of the virtual pet.


VirtualPetShelterApp
This is where user Interaction is present.

Four virtual pets are initially created and are added to the list in VirtualPetShelter through the addVirtualPet(VirtualPet pet)method.
User is given six options. 1 is to feed all pets, 2 is to water all pets, 3 is to play with a pet, 4 is to adopt a pet, 5 is to admit a pet and 6 is to quit.
Based on the users choice, the appropriate methods are called in the VirtualPetShelter class.
