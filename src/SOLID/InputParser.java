package SOLID;

import java.util.Scanner;

public class InputParser {

    public String readLoggerInfo(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder builder = new StringBuilder();

        while (n-- > 0) {
            builder.append(scanner.nextLine()).append(System.lineSeparator());
        }

        return builder.toString();
    }
}
