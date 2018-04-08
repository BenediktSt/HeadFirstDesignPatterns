package de.designpatterns.section5_command.device;

public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){System.out.println(location + " stereo is on");}
    public void off(){System.out.println(location + " stereo is off");}
    public void setCd(){System.out.println(location + " CD is activated in the stereo");}
    public void setDvd(){System.out.println(location + " DVD is activated in the stereo");}
    public void setRadio(){System.out.println(location + " Radio is activated in the stereo");}
    public void setVolume(int volume){System.out.println(location + " stereo volume is set to " + volume);}
}
