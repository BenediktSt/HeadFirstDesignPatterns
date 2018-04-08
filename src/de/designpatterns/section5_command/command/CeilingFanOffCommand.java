package de.designpatterns.section5_command.command;

import de.designpatterns.section5_command.device.CeilingFan;

public class CeilingFanOffCommand implements Command{
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
