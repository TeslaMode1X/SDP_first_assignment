package State;

public class Player {
    PlayerState state;
    public Player() {
        state = new PlayingState(); // first state is playing state
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
