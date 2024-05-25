import entities.AudioRecording;
import entities.Image;
import entities.MultimediaElement;
import entities.Video;

import java.util.Arrays;
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
        System.out.println(Arrays.toString(arrayOfMultimediaElement));
    }

    public static void AddMultimediaArray(MultimediaElement[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Scegli il tipo di file da inserire nel tuo player:");

            System.out.println("1. Immagine \n 2. Audio \n 3. Video");
            Scanner sc = new Scanner(System.in);
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
    }

    public static void multimediaArray(MultimediaElement[] arr) {
        for (int i = 0; i < arr.length ; i++) {

        }
    }
}

