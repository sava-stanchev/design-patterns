package command.remotecontrol;

public class GarageDoor {
    public void up() {
        System.out.println("Garage door is OPEN");
    }

    public void down() {
        System.out.println("Garage door is CLOSED");
    }

    public void stop() {
        System.out.println("Garage door is STOPPED");
    }

    public void lightOn() {
        System.out.println("Garage light is ON");
    }

    public void lightOff() {
        System.out.println("Garage light is OFF");
    }
}