package WildFarmPolymorphismEx;

import java.text.DecimalFormat;

public class Tiger extends Felime {


    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.eat(food);
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s[%s, %s, %s, %d]", this.getClass().getSimpleName(), getAnimalName(),
                decimalFormat.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
