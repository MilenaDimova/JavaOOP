package WildFarmPolymorphismEx04;

public class Tiger extends Mammal {
    public Tiger(String animalType, String animalName, Double animalWeight, String animalRegion) {
        super(animalType, animalName, animalWeight, animalRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            this.foodEaten += food.quantity;
        } else {
            System.out.printf("%ss are not eating that type of food!%n", this.animalType);
        }
    }
}
