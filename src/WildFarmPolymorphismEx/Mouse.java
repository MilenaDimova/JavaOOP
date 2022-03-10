package WildFarmPolymorphismEx;

import java.text.DecimalFormat;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.eat(food);
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s[%s, %s, %s, %d]", this.getClass().getSimpleName(), getAnimalName(),
                decimalFormat.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
