package org.example;

public class VideoGame implements Playable, Saveable {

    private final String name;
    private final String platform;
    private boolean saved;

    public VideoGame(String name, String platform) {
        this.name = name;
        this.platform = platform;
        this.saved = false;
    }

    @Override
    public void play() {
        System.out.println("Видеоигра \"" + name + "\" запущена на платформе " + platform + ".");
    }

    @Override
    public void pause() {
        System.out.println("Видеоигра \"" + name + "\" поставлена на паузу.");
    }

    @Override
    public void stop() {
        System.out.println("Видеоигра \"" + name + "\" остановлена.");
    }

    @Override
    public void save() {
        saved = true;
        System.out.println("Сохранение видеоигры \"" + name + "\" выполнено.");
    }

    @Override
    public void load() {
        if (saved) {
            System.out.println("Загрузка сохранения видеоигры \"" + name + "\" выполнена.");
        } else {
            System.out.println("Нет сохранения для видеоигры \"" + name + "\".");
        }
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isSaved() {
        return saved;
    }
}