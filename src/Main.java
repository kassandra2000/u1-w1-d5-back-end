import entities.AudioRecording;
import entities.Image;
import entities.Video;

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
        Image image1 = new Image(20, "image1");


    }
}