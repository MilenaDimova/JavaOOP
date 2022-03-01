package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }

    public void addPlayer(Player playerToAdd) {
        this.players.add(playerToAdd);
    }

    public void removePlayer(String playerName) {
        if (this.players.stream().anyMatch(player -> player.getName().equals(playerName))) {
            Player playerToRemove = this.players.stream()
                    .filter(player -> player.getName().equals(playerName)).findFirst().get();
            this.players.remove(playerToRemove);
        } else {
            throw new NoSuchElementException(String.format("Player %s is not in %s team.", playerName, this.getName()));
        }
    }

    public double getRating() {
        return this.players.stream().mapToDouble(p -> p.overallSkillLevel()).average().orElse(0);
    }
}
