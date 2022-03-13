package WildFarmPolymorphismEx04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] animalParts = input.split("\\s+");
            input = scanner.nextLine();
            String[] foodParts =  input.split("\\s+");
            Food food = null;
            if (foodParts[0].equals("Vegetable")) {
                food = new Vegetable(Integer.parseInt(foodParts[1]));
            } else if (foodParts[0].equals("Meat")) {
                food = new Meat(Integer.parseInt(foodParts[1]));
            }
            Animal animal = createAnimal(animalParts);
            animal.makeSound();
            animal.eat(food);
            System.out.println(animal);
            input = scanner.nextLine();
        }
    }

    private static Animal createAnimal(String[] animalParts) {
        Animal animal = null;
        switch (animalParts[0]) {
            case "Cat":
                animal = new Cat(animalParts[0], animalParts[1],
                        Double.parseDouble(animalParts[2]), animalParts[3], animalParts[4]);
                break;
            case "Mouse":
                animal = new Mouse(animalParts[0], animalParts[1],
                        Double.parseDouble(animalParts[2]), animalParts[3]);
                break;
            case "Tiger":
                animal = new Tiger(animalParts[0], animalParts[1],
                        Double.parseDouble(animalParts[2]), animalParts[3]);
                break;
            case "Zebra":
                animal = new Zebra(animalParts[0], animalParts[1],
                        Double.parseDouble(animalParts[2]), animalParts[3]);
                break;
        }

        return animal;
    }
}
