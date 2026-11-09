package org.example;

import java.util.List;

public class Dancer {
    private int id;
    private String name;
    private String style;
    private int level;
    private List<Integer> competitionScores;

    public Dancer(int id, String name, String style, int level, List<Integer> competitionScores) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.level = level;
        this.competitionScores = competitionScores;
    }

    public double getAverageScore() {
        if (competitionScores == null || competitionScores.isEmpty()) return 0.0;
        return competitionScores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public String getName() { return name; }
    public int getId() { return id; }
    public String getStyle() { return style; }

    @Override
    public String toString() {
        return String.format("ID: %d | Имя: %-10s | Стиль: %-10s | Уровень: %d | Ср. балл: %.2f",
                id, name, style, level, getAverageScore());
    }
}
