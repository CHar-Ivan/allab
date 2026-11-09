package org.example;

public class Team {


    private String name;
    private String sport;
    private int players;

    private static int totalTeams = 0;
    private static int totalPlayers = 0;


    public Team(String name, String sport, int players) {
        this.name = name;
        this.sport = sport;
        this.players = players;
        totalTeams++;
        totalPlayers += players;
    }


    public static double getAveragePlayers() {
        if (totalTeams == 0) {
            return 0.0;
        }
        return (double) totalPlayers / totalTeams;
    }


    public static int getTotalTeams() {
        return totalTeams;
    }

    public static int getTotalPlayers() {
        return totalPlayers;
    }


    public void printInfo() {
        System.out.printf("Команда: %-18s | Вид спорта: %-12s | Игроков: %d%n",
                name, sport, players);
    }
}