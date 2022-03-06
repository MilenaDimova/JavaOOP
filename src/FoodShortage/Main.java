package FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        for (int people = 0; people < peopleCount; people++) {
            String[] splittedInfo = scanner.nextLine().split("\\s+");
            if (splittedInfo.length == 4) {
                citizens.add(new Citizen(splittedInfo[0], Integer.parseInt(splittedInfo[1]),
                        splittedInfo[2], splittedInfo[3]));
                continue;
            }

            rebels.add(new Rebel(splittedInfo[0], Integer.parseInt(splittedInfo[1]),
                    splittedInfo[2]));
        }

        String command = scanner.nextLine();
        while (!command.endsWith("End")) {
            String name = command;

            citizens.stream()
                    .filter(citizen -> citizen.getName().equals(name))
                    .findFirst()
                    .ifPresent(Citizen::buyFood);

            rebels.stream()
                    .filter(rebel -> rebel.getName().equals(name))
                    .findFirst()
                    .ifPresent(Rebel::buyFood);

            command = scanner.nextLine();
        }

        int sum = citizens.stream().map(Citizen::getFood).reduce(0, Integer::sum) +
                rebels.stream().map(Rebel::getFood).reduce(0, Integer::sum);

        System.out.println(sum);

        scanner.close();
    }
}
