package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Birthable> birthdays = new ArrayList<>();

        while (!input.equals("End")) {
            String[] inputInfo = input.split("\\s+");
            switch (inputInfo[0]) {
                case "Citizen":
                    Citizen citizen = new Citizen(inputInfo[1], Integer.parseInt(inputInfo[2]),
                            inputInfo[3], inputInfo[4]);
                    birthdays.add(citizen);
                break;
                case "Pet":
                    Pet pet = new Pet(inputInfo[1], inputInfo[2]);
                    birthdays.add(pet);
                    break;
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        birthdays.stream().filter(b -> b.getBirthDate().endsWith(year))
                .forEach(type -> System.out.println(type.getBirthDate()));

    }
}
