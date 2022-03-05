package animals;

public abstract class Animal implements Soundable {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        if (!gender.trim().isEmpty()) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public abstract String produceSound();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        stringBuilder.append(String.format("%s %d %s", this.name, this.age, this.gender)).append(System.lineSeparator());
        stringBuilder.append(this.produceSound());
        return stringBuilder.toString();
    }
}
