package State;

// each of those three implementations will do the same thing,
// but they will be changing between states
public interface PlayerState {
    void play(Player player);
    void pause(Player player);
    void stop(Player player);
}
