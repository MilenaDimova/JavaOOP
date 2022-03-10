package WildFarmPolymorphismEx;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    public static Animal createAnimal(String[] animalInfo) {
        switch (animalInfo[0]) {
            case "Mouse":
                return new Mouse(animalInfo[1], animalInfo[0], Double.valueOf(animalInfo[2]), animalInfo[3]);
            case "Zebra":
                return new Zebra(animalInfo[1], animalInfo[0], Double.valueOf(animalInfo[2]), animalInfo[3]);
            case "Tiger":
                return new Tiger(animalInfo[1], animalInfo[0], Double.valueOf(animalInfo[2]), animalInfo[3]);
            case "Cat":
                return new Cat(animalInfo[1], animalInfo[0], Double.valueOf(animalInfo[2]), animalInfo[3], animalInfo[4]);
        }
        return null;
    }

}
