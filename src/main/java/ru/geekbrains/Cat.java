package ru.geekbrains;

public class Cat {
    public String name;
    public int appetitte;
    public boolean fullness;

    public Cat(String name, int appetitte, boolean fullness) {
        this.name = name;
        this.appetitte = appetitte;
        this.fullness = fullness;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetitte);
    }
}
