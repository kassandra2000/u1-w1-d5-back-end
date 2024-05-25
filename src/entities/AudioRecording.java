package entities;

import interfaces.Play;
import interfaces.Volume;

import java.util.Scanner;

public class AudioRecording extends MultimediaElement implements Play, Volume {
    //costruttore
    public AudioRecording(String title, int volume, int duration) {
        super(title, volume, duration);
    }

    //metodi interfacce
    @Override
    public void play() {
        System.out.println("\n");
        String exclamationPoint = "";
        for (int i = 0; i < this.getVolume(); i++) {
            exclamationPoint += "!";
        }
        for (int i = 0; i < this.getDuration(); i++) {
            System.out.println(this.getTitle() + exclamationPoint);
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
        System.out.println("Aumenta volume");

        while (Integer.parseInt(sc.nextLine()) < this.getVolume()) {
            System.out.println("inserisci un numero maggiore a: " + this.getVolume() + " hai inserito: " + sc.nextLine());
        }
        int newVolume = setVolume(Integer.parseInt(sc.nextLine()));
        System.out.println("il volume è: " + newVolume);
        sc.close();
    }
}
