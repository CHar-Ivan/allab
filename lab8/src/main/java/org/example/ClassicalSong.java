package org.example;

public class ClassicalSong extends Music {
    private String orchestra;

    public ClassicalSong(String title, String artist, double duration, String orchestra) {
        super(title, artist, duration);
        this.orchestra = orchestra;
    }

    public String getOrchestra() { return orchestra; }
    public void setOrchestra(String orchestra) { this.orchestra = orchestra; }

    @Override
    public String getGenre() {
        return "Классика";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Оркестр: " + orchestra);
    }


    public void conduct() {
        System.out.println("Дирижёр управляет оркестром \"" + orchestra + "\" при исполнении \""
                + getTitle() + "\".");
    }
}