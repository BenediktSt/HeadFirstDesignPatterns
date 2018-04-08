package de.designpatterns.section5_command.invoker;

import de.designpatterns.section5_command.command.Command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {}

    public void setCommand (Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
