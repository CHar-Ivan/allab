package org.example;
public class RockSong extends Music {
    private boolean guitarSolo;

    public RockSong(String title, String artist, double duration, boolean guitarSolo) {
        super(title, artist, duration);
        this.guitarSolo = guitarSolo;
    }

    public boolean isGuitarSolo() { return guitarSolo; }
    public void setGuitarSolo(boolean guitarSolo) { this.guitarSolo = guitarSolo; }

    @Override
    public String getGenre() {
        return "Рок";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Гитаное соло: " + (guitarSolo ? "да" : "нет"));
    }


    public void playSolo() {
        if (guitarSolo) {
            System.out.println("В песне \"" + getTitle() + "\" звучит гитарное соло!");
        } else {
            System.out.println("В песне \"" + getTitle() + "\" нет гитарного соло.");
        }
    }
}