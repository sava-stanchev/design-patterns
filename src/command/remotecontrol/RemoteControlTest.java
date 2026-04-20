package command.remotecontrol;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        Command lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        Command garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}