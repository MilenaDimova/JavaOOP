package WildFarmPolymorphismEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();
        while (!input.equals("End" )) {
            String[] animalInfo = input.split("\\s+");
            String[] foodInfo = scanner.nextLine().split("\\s+");

            Animal animal = Animal.createAnimal(animalInfo);
            Food food = getFood(foodInfo);

            assert animal != null;
            animal.makeSound();
            animal.eat(food);
            animals.add(animal);

            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static Food getFood(String[] foodInfo) {
        String foodType = foodInfo[0];
        int foodQuantity = Integer.parseInt(foodInfo[1]);
        if (foodType.equals("Meat")) {
            return new Meat(foodQuantity);
        } else {
            return new Vegetable(foodQuantity);
        }
    }
}
