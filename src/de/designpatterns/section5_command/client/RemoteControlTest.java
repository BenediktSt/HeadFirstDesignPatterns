package de.designpatterns.section5_command.client;

import de.designpatterns.section5_command.command.GarageDoorOpenCommand;
import de.designpatterns.section5_command.command.LightOnCommand;
import de.designpatterns.section5_command.invoker.SimpleRemoteControl;
import de.designpatterns.section5_command.device.GarageDoor;
import de.designpatterns.section5_command.device.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        GarageDoor garageDoor = new GarageDoor("");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
