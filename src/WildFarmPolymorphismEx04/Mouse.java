package WildFarmPolymorphismEx04;

public class Mouse extends Mammal {
    public Mouse(String animalType, String animalName, Double animalWeight, String animalRegion) {
        super(animalType, animalName, animalWeight, animalRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            this.foodEaten += food.quantity;
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
