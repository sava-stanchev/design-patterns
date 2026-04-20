package command.remotecontrol;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // devices (receivers)
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        // light commands
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);

        // garage commands
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDown = new GarageDoorDownCommand(garageDoor);

        // stereo commands
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // assign commands to slots
        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, garageOpen, garageDown);
        remoteControl.setCommand(2, stereoOn, stereoOff);

        // visualize remote
        System.out.println(remoteControl);

        // simulate button presses
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}