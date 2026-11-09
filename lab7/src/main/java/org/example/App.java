package org.example;
public class App 
{
        public static void main(String[] args) {

            Team t1 = new Team("Динамо", "Футбол", 23);
            Team t2 = new Team("ЦСКА", "Баскетбол", 12);
            Team t3 = new Team("Зенит", "Волейбол", 14);
            Team t4 = new Team("Спартак", "Хоккей", 20);
            Team t5 = new Team("Локомотив", "Футбол", 25);
            System.out.println("=== Список команд ===");
            t1.printInfo();
            t2.printInfo();
            t3.printInfo();
            t4.printInfo();
            t5.printInfo();
            System.out.println();
            System.out.println("Всего команд: " + Team.getTotalTeams());
            System.out.println("Всего игроков: " + Team.getTotalPlayers());
            System.out.printf("Среднее число игроков на команду: %.2f%n",
                    Team.getAveragePlayers());
        }
    }
