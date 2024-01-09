package main.java;

import main.java.animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik barsik = new Kotik("Barsic", "Мяу", 3, 5);
        Kotik murka = new Kotik();
        murka.setName("Murka");
        murka.setVoice("Гав");
        murka.setSatiety(3);
        murka.setWeight(4);

        String[] massiv = barsik.liveAnotherDay();
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
        System.out.println(barsik.getName());
        System.out.println(barsik.getWeight());
        System.out.println(compareVoice(barsik, murka));
        System.out.println(Kotik.getCount());
    }

    static boolean compareVoice(Kotik barsic, Kotik murka) {
        return barsic.getVoice().equals(murka.getVoice());
    }
}
