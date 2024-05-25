package entities;

import interfaces.Brightness;
import interfaces.Play;
import interfaces.Volume;

import java.util.Scanner;

public class Video extends MultimediaElement implements Play, Volume, Brightness {

    //costruttore
    public Video(String title, int volume, int duration, int brightness) {
        super(title, volume, duration, brightness);
    }


    //metodi interfacce
    @Override
    public void play() {
        System.out.println("\n");
        String exclamationPoint = "";
        String asterisk = "";
        for (int i = 0; i < this.getVolume(); i++) {
            exclamationPoint += "!";
        }
        for (int i = 0; i < this.getBrightness(); i++) {
            asterisk += "*";
        }
        for (int i = 0; i < this.getDuration(); i++) {
            System.out.println(this.getTitle() + exclamationPoint + asterisk);
        }

    }

    @Override
    public void turnDownTheVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diminuisci volume");

        while (Integer.parseInt(sc.nextLine()) > this.getVolume()) {
            System.out.println("inserisci un numero minore a: " + this.getVolume() + " hai inserito: " + sc.nextLine());

        }
        int newVolume = setVolume(Integer.parseInt(sc.nextLine()));
        System.out.println("il volume è: " + newVolume);
        sc.close();
    }

    @Override
    public void turnUpTheVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diminuisci volume");

        while (Integer.parseInt(sc.nextLine()) < this.getVolume()) {
            System.out.println("inserisci un numero maggiore a: " + this.getVolume() + " hai inserito: " + sc.nextLine());

        }
        int newVolume = setVolume(Integer.parseInt(sc.nextLine()));
        System.out.println("il volume è: " + newVolume);
        sc.close();
    }

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
