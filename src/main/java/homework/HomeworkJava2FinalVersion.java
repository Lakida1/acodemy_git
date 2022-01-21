package homework;

import java.util.Scanner;

public class HomeworkJava2FinalVersion {
    public static void main(String[] args) {
        Scanner userTerminal = new Scanner(System.in);
        //if  int = 10, print "Integer value is 10"; status - done;
        System.out.println("1 exercise: if number is 10, then Integer value is 10 :");
        int intTen = 10;
        int intNonTen = 10;
        if (intNonTen == intTen) {
            System.out.println("the integer value is 10");
        } else {
            System.out.println("the integer value is not 10");
        }

        // pracecnaja: in int from 18 until 65, 18-21 10%, 22-65 15%, over 65 15%, change int to define age and to give a discount; status - done;
        System.out.println("2 exercise: the discount depends on the customer age. Please put Your age:");
        int ageOfClient = userTerminal.nextInt();
        if (ageOfClient < 18) {
            System.out.println("Your age group is less 18: Please call mom! :)");
        } else if (ageOfClient >= 18 && ageOfClient <= 21) {
            System.out.println("Your age group from 18 till 21  so Your discount are: 10 %");
        } else if (ageOfClient > 21 && ageOfClient <= 65) {
            System.out.println("Your age group from 21 till 65 so Your discount are: 15 %");
        } else if (ageOfClient > 65) {
            System.out.println("Your age group over 65 so Your discount are 20 %");
        }

// 10 animals, status - partially complete (ne razobralas s else) NE ZNAJU, POCEMU NE OSTANAVLIVAETSJA DLA ZAVEDENIJA NAZAVNIJA ZIVOTNOGO I VIPOLNENIJA (OTDELNO RABOTAET)

        System.out.println("3 exercise: 10 animals (loop FOR)");
        System.out.println("Print any animal name. Please select from the list: cat, elephant, dog, panda, monkey, mouse, snake, swan, tiger, lion.");
        // String userAnimalName = userTerminal.nextLine();
        String[] listOfAnimals = {"cat", "elephant", "dog", "panda", "monkey", "mouse", "snake", "swan", "tiger", "lion"};
        String userAnimalName = "panda";
        for (String item : listOfAnimals) {
            if (userAnimalName.equalsIgnoreCase(item)) {
                System.out.println(item);
            }
        }

        // array from 0 do 10, to print only even numbers; status - done;

        System.out.println("4 exercise - print only even numbers from array [1..10]:");
        int[] number = new int[10];
        for (int i = 1; i <= number.length; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        System.out.println('\n');

        //transport

        System.out.println("5 exercise - transport choice");
        String transportChoice = "car";

        switch (transportChoice) {
            case "car":
                System.out.println("Your choice is a car, a taxi or friend's car. Please check fuel in Your car and/or money in Your wallet. If it is friend's car smile is enough :)");
                break;
            case "public transport":
                System.out.println("Please choose a bus or a tram. Please check before departure accessibility for bus/tram station near home and near the work place, also please check timetable and possibility to bay ticket. ");
                break;
            case "bicycle":
                System.out.println("It is the great choice for Your health, but please check weather.");
                break;
            case "holidays":
                System.out.println("You have the only one choose of transport: a taxi to airport and a airplane to Canary islands (the name of island as Your wish :), but please check money in Your wallet before departure :)");
        }

//print numbers from 1 till 100; status - done;
        System.out.println("6 exercise - to print numbers from 1 till 100: ");
        for (int x = 1; x <= 100; x++) {
            System.out.print(x + " ");
        }
        System.out.print('\n');

        //print   number from 50 till 1; status - done;
        System.out.println("7 exercise - to print numbers from 50 till 1: ");
        for (int y = 50; y >= 1; y--) {
            System.out.print(y + " ");
        }
        System.out.println('\n');

        // 8.multiplication table; status - done;
        System.out.println("8 exercise: multiplication table (from 1 until 10) ");
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.printf("%4d", (a * b));
            }
            System.out.println(" ");
        }

    }
}