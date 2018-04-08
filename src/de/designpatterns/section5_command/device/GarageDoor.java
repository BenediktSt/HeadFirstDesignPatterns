package de.designpatterns.section5_command.device;

public class GarageDoor {
    public void up(){System.out.println("Garage Door is Open");}
    public void down(){System.out.println("Garage Door is Closed");}
    public void stop(){System.out.println("Garage Door stopped");}
    public void lightOn(){System.out.println("Garage Light ist on");}
    public void lightOff(){System.out.println("Garage Light is off");}
}
