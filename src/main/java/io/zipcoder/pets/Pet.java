package io.zipcoder.pets;

/**
 * Created by joseph on 2/2/16.
 */
public class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String speak() {
        return "unknown";
    }
}
