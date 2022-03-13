package WildFarmPolymorphismEx04;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    protected Mammal(String animalType, String animalName, Double animalWeight, String animalRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = animalRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]", this.animalType, this.animalName,
                decimalFormat.format(animalWeight), this.livingRegion, this.foodEaten);
    }
}
