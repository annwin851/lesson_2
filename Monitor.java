package ru.levelup.lesson3.random;

public class Monitor {

    @RandomInt(min = 10, max = 39)
    private int id;

    public int getId() {
        return id;
    }
}
