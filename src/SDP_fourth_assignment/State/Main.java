package State;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.stop();
        player.play();
        player.pause();
        player.stop();
    }
}
