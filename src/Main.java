import entities.AudioRecording;
import entities.Image;
import entities.MultimediaElement;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //audio
        AudioRecording audioRecording1 = new AudioRecording("audio1", 10, 2);
        audioRecording1.play();
        // audioRecording1.turnUpTheVolume();

        //video
        Video video1 = new Video("video1", 2, 3, 7);
        video1.play();
        // video1.lowerBrightness();

        //immagini
        Image image1 = new Image(6, "image1");
        image1.show();

        //array
        MultimediaElement[] arrayOfMultimediaElement = new MultimediaElement[5];
        AddMultimediaArray(arrayOfMultimediaElement);

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void AddMultimediaArray(MultimediaElement[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Scegli il tipo di file da inserire nel tuo player:");

            System.out.println("1. Immagine \n 2. Audio \n 3. Video");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Scegli un titolo:");
                    String imageTitle = sc.nextLine();
                    System.out.println("Scegli la luminosità");
                    int imageBrightness = Integer.parseInt(sc.nextLine());
                    arr[i] = new Image(imageBrightness, imageTitle);
                    break;
                case 2:
                    System.out.println("Scegli un titolo ");
                    String audioTitle = sc.nextLine();
                    System.out.println("Scegli la durata");
                    int durationAudio = Integer.parseInt(sc.nextLine());
                    System.out.println("Scegli il volume");
                    int volumeAudio = Integer.parseInt(sc.nextLine());
                    arr[i] = new AudioRecording(audioTitle, volumeAudio, durationAudio);
                    break;
                case 3:
                    System.out.println("Scegli un titolo ");
                    String videoTitle = sc.nextLine();
                    System.out.println("Scegli la durata");
                    int durataVideo = Integer.parseInt(sc.nextLine());
                    System.out.println("Scegli il volume");
                    int volumeVideo = Integer.parseInt(sc.nextLine());
                    System.out.println("Scegli la luminosità");
                    int videoBrightness = Integer.parseInt(sc.nextLine());
                    arr[i] = new Video(videoTitle, volumeVideo, durataVideo, videoBrightness);
                    break;
                default:
                    System.out.println("Scelta non valida, scelte possibile da 1 a 3");
                    i--;
                    break;
            }

        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println("Scegli l'oggetto da eseguire:");

            System.out.println(STR."""
1. \{arr[0].getTitle()}\s
 2. \{arr[1].getTitle()}\s
 3. \{arr[2].getTitle()}\s
 4. \{arr[3].getTitle()}\s
 5. \{arr[4].getTitle()}""");


        int choice = Integer.parseInt(sc.nextLine());

        if (arr[choice] instanceof AudioRecording) {
            System.out.println("sono un audio");
            ((AudioRecording) arr[choice]).play();
        } else if (arr[choice] instanceof Video) {
            System.out.println("sono un video");
            ((Video) arr[choice]).play();
        } else {
            System.out.println("sono un immagine");
            ((Image) arr[choice]).show();
        }
        }
    }


}

