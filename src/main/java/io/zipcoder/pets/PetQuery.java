package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by joseph on 2/2/16.
 */
public class PetQuery {
    private int numOfPets;
    private ArrayList<Pet> petNameAndTypes;
    private UserInput userInput = new UserInput();

    public PetQuery() {
        numOfPets = userInput.getIntFromUser("How many pets do you have?");
        petNameAndTypes = askUserForPetNameAndTypes();

    }

    private ArrayList<Pet> askUserForPetNameAndTypes() {
        String message = "What is the name of your ";
        String message2 = "What kind of animal is your pet?";

        return userInput.getArrayListFromUser(message, message2, numOfPets);
    }


    public void showPets() {
        for (Pet pet : petNameAndTypes) {
            System.out.println(pet.getName() + " says " + pet.speak());
        }
    }
}
