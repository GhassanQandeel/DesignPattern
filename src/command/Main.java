package command;

import command.conceratecommand.LightOffCommand;
import command.conceratecommand.LightOnCommand;
import command.invoker.RemoteControl;
import command.receiver.Light;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();

        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(onCommand);
        remote.pressButton();

        remote.setCommand(offCommand);
        remote.pressButton();
    }
}