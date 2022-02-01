package homework;

public class Animal {
    private String name;
    private int energyLevel = 4;
    private boolean isNight = true;

    public Animal(String name, boolean isNight) {
        this.name = name;
        this.isNight = isNight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNight(boolean night) {
        isNight = night;
    }

    public void eat() {

        while (energyLevel <= 4) {
            if (energyLevel >= 0) {
                System.out.println("Thank You! My energy level is: " + energyLevel);
            } else {
                System.out.println("I want to eat!");
            }
            energyLevel++;
        }
    }


    public void walk() {
        if (isNight == false) {
            if (energyLevel >= 1) {
                energyLevel--;
                System.out.println(name + ". I am walking. My energy level is " + energyLevel + ". My max level are 4");
            } else System.out.println("I can not to walk,I want to eat. Please feed me!");
        } else System.out.println("I am sleeping");
    }

    public void play() {
        if (isNight == false) {
            if (energyLevel >= 1) {
                energyLevel--;
                System.out.println(name + ". I am playing. My energy level is " + energyLevel + ". My max level are 4");
            } else System.out.println("I can not to play,I want to eat. Please feed me!");
        } else System.out.println("I am sleeping");
    }

    public void work() {
        if (isNight == false) {
            if (energyLevel >= 1) {
                energyLevel--;
                System.out.println(name + ". I am working. My energy level is " + energyLevel + ". My max level are 4");
            } else System.out.println("I can not to work,I want to eat. Please feed me!");
        } else System.out.println("I am sleeping");
    }

    public void sleep() {
        if (isNight) {
            System.out.println("I am going to sleep. See You tomorrow :)");
        } else System.out.println("Please continue");
    }
}

