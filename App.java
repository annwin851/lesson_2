package ru.levelup.lesson3.random;


public class App {

    public static void main(String[] args) throws IllegalAccessException {

        Monitor monitor = new Monitor();
        RandomIntProcessor.process(monitor);


            System.out.println("Monitor ID" + monitor.getId());

        }

    }


