package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joseph on 2/2/16.
 */
public class UserInput {
    private Scanner in;
    private PetQuery petQuery;


    public int getIntFromUser(String message) {

        int numOfPets = 0;
        in = new Scanner(System.in);
        do {
            System.out.println(message);
            while (!in.hasNextInt()) {
                System.out.println("Not a number. Please enter your number of pets.");
                in.next();
            }
            numOfPets = in.nextInt();
        }
        while (numOfPets < 0);

        return numOfPets;
    }

    public ArrayList<Pet> getArrayListFromUser(String message1, String message2, int num) {

        ArrayList<Pet> userPets = new ArrayList<Pet>();
        in = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println(message1 + (i+1) + endOfNumberWords(i+1));
            String name = in.next();
            System.out.println(message2);
            String petType = in.next();
            Pet pet = assignPet(petType);
            pet.setName(name);
            userPets.add(pet);
        }

        return userPets;
    }

    private String endOfNumberWords(int num) {
        switch (num) {
            case 1:
                return "st pet?";
            case 2:
                return "nd pet?";
            case 3:
                return "rd pet?";
            default:
                return "th pet?";
        }
    }

    public Pet assignPet(String petType) {
        petType = petType.toLowerCase();
        if (petType.equals("dog"))
            return new Dog();
        if (petType.equals("cat"))
            return new Cat();
        if (petType.equals("goat"))
            return new Goat();
        else
            return new Pet();

    }
}
