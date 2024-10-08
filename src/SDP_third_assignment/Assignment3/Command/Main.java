package Assignment3.Command;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl remote = new RemoteControl();

        // создание
        NextChannelCommand next = new NextChannelCommand(tv);
        PreviousChannelCommand prev = new PreviousChannelCommand(tv);

        TurnOnCommand on = new TurnOnCommand(tv);
        TurnOffCommand off = new TurnOffCommand(tv);

        VolumeUpCommand up = new VolumeUpCommand(tv);
        VolumeDownCommand down = new VolumeDownCommand(tv);

        // настройка
        remote.setCommand("on", on);
        remote.setCommand("off", off);

        remote.setCommand("up", up);
        remote.setCommand("down", down);

        remote.setCommand("next", next);
        remote.setCommand("prev", prev);

        // использование
        remote.buttonPressed("on");
        remote.buttonPressed("off");

        remote.buttonPressed("up");
        remote.buttonPressed("down");

        remote.buttonPressed("next");
        remote.buttonPressed("prev");
    }
}
