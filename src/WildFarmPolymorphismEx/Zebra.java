package WildFarmPolymorphismEx;

import java.text.DecimalFormat;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.eat(food);
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s[%s, %s, %s, %d]", this.getClass().getSimpleName(), getAnimalName(),
                decimalFormat.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
