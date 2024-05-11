package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void showVolume() {
        System.out.println("현재 볼륨" + volume);
    }
}
