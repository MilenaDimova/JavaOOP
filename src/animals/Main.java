package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Soundable> allAnimals = new ArrayList<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Beast!")) {
            try {
                switch (inputLine) {
                    case "Cat":
                        String[] catInfo = scanner.nextLine().split("\\s+");
                        Soundable cat = new Cat(catInfo[0], Integer.parseInt(catInfo[1]), catInfo[2]);
                        allAnimals.add(cat);
                        break;
                    case "Dog":
                        String[] dogInfo = scanner.nextLine().split("\\s+");
                        Soundable dog = new Dog(dogInfo[0], Integer.parseInt(dogInfo[1]), dogInfo[2]);
                        allAnimals.add(dog);
                        break;
                    case "Frog":
                        String[] frogInfo = scanner.nextLine().split("\\s+");
                        Soundable frog = new Frog(frogInfo[0], Integer.parseInt(frogInfo[1]), frogInfo[2]);
                        allAnimals.add(frog);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }

            inputLine = scanner.nextLine();
        }

        allAnimals.forEach(animal -> System.out.println(animal.toString()));
    }
}
