package entities;

import interfaces.Brightness;

import java.util.Scanner;

public class Image extends MultimediaElement implements Brightness {

    //costruttore
    public Image(int brightness, String title) {
        super(brightness, title);
    }

    //metodi
    public void show() {
        String asterisk = "";
        for (int i = 0; i < this.getBrightness(); i++) {
            asterisk += "*";
        }
        System.out.println("\n" + this.getTitle() + asterisk);
    }

    //metodi interfacce
    @Override
    public void lowerBrightness() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diminuisci luminosità");

        while (Integer.parseInt(sc.nextLine()) > this.getBrightness()) {
            System.out.println("inserisci un numero minore a: " + this.getBrightness() + " hai inserito: " + sc.nextLine());

        }
        int newBrightness = setBrightness(Integer.parseInt(sc.nextLine()));
        System.out.println("La2 luminosità è: " + newBrightness);
        sc.close();
    }

    @Override
    public void turnUpBrightness() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aumenta luminosità");

        while (Integer.parseInt(sc.nextLine()) < this.getBrightness()) {
            System.out.println("inserisci un numero maggiore a: " + this.getBrightness() + " hai inserito: " + sc.nextLine());
        }
        int newBrightness = setBrightness(Integer.parseInt(sc.nextLine()));
        System.out.println("La luminosità è: " + newBrightness);
        sc.close();
    }
}
