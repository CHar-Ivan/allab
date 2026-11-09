package org.example;

public class MusicTest {
    public static void main(String[] args) {

        Music[] playlist = new Music[5];


        playlist[0] = new RockSong("Bohemian Rhapsody", "Queen", 5.9, true);
        playlist[1] = new RockSong("Smells Like Teen Spirit", "Nirvana", 5.0, true);
        playlist[2] = new RockSong("Wonderwall", "Oasis", 4.2, false);


        playlist[3] = new ClassicalSong("Времена года: Весна", "А. Вивальди", 10.5, "Симфонический оркестр");
        playlist[4] = new ClassicalSong("Лунная соната", "Л. ван Бетховен", 14.0, "Камерный оркестр");

        System.out.println("=== Плейлист ===");
        for (Music m : playlist) {
            m.displayInfo();
            System.out.println();
        }

        System.out.println("=== Демонстрация уникальных методов ===");
        for (Music m : playlist) {
            if (m instanceof RockSong) {
                ((RockSong) m).playSolo();
            } else if (m instanceof ClassicalSong) {
                ((ClassicalSong) m).conduct();
            }
        }
    }
}