package de.designpatterns.section5_command.device;

public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " light on");
    }

    public void off(){
        System.out.println(location + " light off");
    }
}
