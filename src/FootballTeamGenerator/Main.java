package FootballTeamGenerator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Team> teams = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String command = input.split(";")[0];
            String teamName = input.split(";")[1];
            switch (command) {
                case "Team":
                    Team team = new Team(teamName);
                    if (!teams.contains(team)) {
                        teams.add(team);
                    }
                    break;
                case "Add":
                    String playerName = input.split(";")[2];
                    int endurance = Integer.parseInt(input.split(";")[3]);
                    int sprint = Integer.parseInt(input.split(";")[4]);
                    int dribble = Integer.parseInt(input.split(";")[5]);
                    int passing = Integer.parseInt(input.split(";")[6]);
                    int shooting = Integer.parseInt(input.split(";")[7]);
                    Optional<Team> playerTeam = teams.stream().filter(t -> t.getName().equals(teamName)).findFirst();
                    if (playerTeam.isPresent()) {
                        try {
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            playerTeam.get().addPlayer(player);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    }
                    break;
                case "Remove":
                    String playerToRemove = input.split(";")[2];
                    try {
                        Optional<Team> playerToRemoveTeam = teams.stream().filter(t -> t.getName().equals(teamName)).findFirst();
                        if (playerToRemoveTeam.isPresent()) {
                            playerToRemoveTeam.get().removePlayer(playerToRemove);
                        }
                    }
                    catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Rating":
                    Optional<Team> teamStatus = teams.stream().filter(t -> t.getName().equals(teamName)).findFirst();
                    if (teamStatus.isPresent()) {
                        System.out.printf("%s - %d%n", teamStatus.get().getName(), Math.round(teamStatus.get().getRating()));
                    } else {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

    }
}
