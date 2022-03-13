package WildFarmPolymorphismEx04;

public class Zebra extends Mammal {
    public Zebra(String animalType, String animalName, Double animalWeight, String animalRegion) {
        super(animalType, animalName, animalWeight, animalRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            this.foodEaten += food.quantity;
        } else {
            System.out.printf("%ss are not eating that type of food!%n", this.animalType);
        }
    }
}
