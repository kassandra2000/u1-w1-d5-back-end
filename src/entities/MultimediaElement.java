package entities;

public class MultimediaElement {
    private final String title;
    private int brightness;
    private int volume;
    private int duration;

    //costruttore


    public MultimediaElement(int brightness, String title) {
        this.brightness = brightness;
        this.title = title;
    }

    public MultimediaElement(String title, int volume, int duration, int brightness) {
        this.title = title;
        this.volume = volume;
        this.duration = duration;
        this.brightness = brightness;
    }

    public MultimediaElement(String title, int volume, int duration) {
        this.title = title;
        this.volume = volume;
        this.duration = duration;
    }
    //metodi

    //getter
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getVolume() {
        return volume;
    }
    //setter

    public int setVolume(int volume) {
        this.volume = volume;
        return volume;
    }

    public int setBrightness(int brightness) {
        this.brightness = brightness;
        return brightness;
    }
}
