package State;

public class StoppedState implements PlayerState {

    @Override
    public void play(Player player) {
        System.out.println("Starting the player from the beginning.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Player is stopped. Can't pause.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Player is already stopped.");
    }
}
