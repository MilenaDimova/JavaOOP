package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> societyMembers = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] splittedInput = input.split("\\s+");
            if (splittedInput.length == 3) {
                String name = splittedInput[0];
                int age = Integer.parseInt(splittedInput[1]);
                String id = splittedInput[2];
                Identifiable citizen = new Citizen(name, age, id);
                societyMembers.add(citizen);
            } else {
                String model = splittedInput[0];
                String id = splittedInput[1];
                Identifiable robot = new Robot(model, id);
                societyMembers.add(robot);
            }

            input = scanner.nextLine();
        }

        String lastDigitsOfId = scanner.nextLine();
        societyMembers.stream().map(Identifiable::getId).
                filter(id -> id.endsWith(lastDigitsOfId)).forEach(System.out::println);
    }
}
