package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joseph on 2/2/16.
 */
public class UserInput {
    private Scanner in;


    public int getIntFromUser(String message) {
        in = new Scanner(System.in);
        System.out.println(message);
        if (!in.hasNextInt()) {
            return getIntFromUser("Invalid input. Please enter the number of pets you have.");
        }
        int numOfPets = in.nextInt();
        if (numOfPets < 0) {
            return getIntFromUser("Invalid input...negative number.");
        }

        return numOfPets;
    }

    public ArrayList<String[]> getArrayListFromUser(String message1, String message2, int num) {
        ArrayList<String[]> userStrings = new ArrayList<String[]>();
        in = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            String[] petInfo = new String[2];
            System.out.println(message1 + (i+1) + endOfNumberWords(i+1));
            petInfo[0] = in.next();
            System.out.println(message2);
            petInfo[1] = in.next();
            userStrings.add(petInfo);
        }

        return userStrings;
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
}
