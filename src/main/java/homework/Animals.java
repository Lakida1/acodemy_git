package homework;

public class Animals {

    public static void main(String[] args) {
        Animal cat = new Animal("Cat", false);
        Animal dog = new Animal("Dog", true);
        Animal bird = new Animal("Bird", true);
        Animal leon = new Animal("Leon", true);
        Animal cow = new Animal("Cow", true);
        Animal elephant = new Animal("Elephant", true);
        elephant.work();
        elephant.setNight(false);
        elephant.work();
        cat.walk();
        cat.work();
        cat.eat();

    }
}
