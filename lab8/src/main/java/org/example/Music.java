package org.example;
public class Music {
    private String title;
    private String artist;
    private double duration;

    public Music(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getDuration() { return duration; }

    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setDuration(double duration) { this.duration = duration; }

    public String getGenre() {
        return "Неизвестный жанр";
    }

    public void displayInfo() {
        System.out.printf("Название: %s | Исполнитель: %s | Длительность: %.1f мин | Жанр: %s%n",
                title, artist, duration, getGenre());
    }
}