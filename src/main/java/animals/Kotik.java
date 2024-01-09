package main.java.animals;

import java.lang.reflect.Array;

public class Kotik {

    private String name;
    private String voice;
    private int satiety;
    private int weight;

    private static int count;
    private final int METHODS = 5;

    public Kotik(String name, String voice, int satiety, int weight) {
        count++;
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSatiety() {
        return satiety;
    }

    public static int getCount() {
        return count;
    }


    public Kotik() {
        count++;
    }

    public boolean play() {
        if (satiety > 0) {
            IfSatiety();
            return true;
        }
        return false;
    }

    public boolean sleep() {
        if (satiety > 0) {
            IfSatiety();
            return true;
        }
        return false;
    }

    public boolean wash() {
        if (satiety > 0) {
            IfSatiety();
            return true;
        }
        return false;
    }

    public boolean walk() {
        if (satiety > 0) {
            IfSatiety();
            return true;
        }
        return false;
    }

    public boolean hunt() {
        if (satiety > 0) {
            IfSatiety();
            return true;
        }
        return false;
    }

    public void eat(int satiety) {
        this.satiety = satiety;
    }

    public void eat(int satiety, String eatName) {
    }

    public void eat() {
        eat(2, "Котлетка");
    }

    public String[] liveAnotherDay() {
        String[] live = new String[24];
        for (int i = 0; i < 24; i++) {
            int random = (int) (Math.random() * METHODS) + 1;
            //System.out.println("random: "+ random);
            switch (random) {
                case 1:
                    if (play()) {
                        live[i] = i + " - play";
                    } else {
                        eat(3);
                        live[i] = i + " - eat";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        live[i] = i + " - sleep";
                    } else {
                        eat(3);
                        live[i] = i + " - eat";
                    }
                    break;
                case 3:
                    if (wash()) {
                        live[i] = i + " - wash";
                    } else {
                        eat(3);
                        live[i] = i + " - eat";
                    }
                    break;
                case 4:
                    if (walk()) {
                        live[i] = i + " - walk";
                    } else {
                        eat(3);
                        live[i] = i + " - eat";
                    }
                    break;
                case 5:
                    if (hunt()) {
                        live[i] = i + " - hunt";
                    } else {
                        eat(3);
                        live[i] = i + " - eat";
                    }
            }
        }

        return live;
    }

    public void IfSatiety() {
        System.out.println("the cat is full");
        satiety--;
    }
}
