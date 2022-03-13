package WildFarmPolymorphismEx04;

import java.text.DecimalFormat;

public class Cat extends Mammal {
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String animalRegion, String breed) {
        super(animalType, animalName, animalWeight, animalRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.foodEaten += food.quantity;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.animalType, this.animalName, this.breed,
                decimalFormat.format(animalWeight), this.livingRegion, this.foodEaten);
    }
}
