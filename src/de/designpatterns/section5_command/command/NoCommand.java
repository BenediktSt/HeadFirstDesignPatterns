package de.designpatterns.section5_command.command;

public class NoCommand implements Command {
    public NoCommand() {}

    @Override
    public void execute() {
        System.out.println("Nothing happens");
    }
}
