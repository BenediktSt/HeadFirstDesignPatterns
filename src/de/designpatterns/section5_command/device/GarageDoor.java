package de.designpatterns.section5_command.device;

public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){System.out.println(location + " garage door is open");}
    public void down(){System.out.println(location + " garage door is closed");}
    public void stop(){System.out.println(location + " garage door stopped");}
    public void lightOn(){System.out.println(location + " garage light ist on");}
    public void lightOff(){System.out.println(location + " garage light is off");}
}
