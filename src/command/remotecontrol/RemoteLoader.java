package command.remotecontrol;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // devices (receivers)
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        // commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDown = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        Command[] partyOn = { livingRoomLightOn, stereoOn, ceilingFanHigh };
        Command[] partyOff = { livingRoomLightOff, stereoOff, ceilingFanOff };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // assign commands to slots
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageOpen, garageDown);
        remoteControl.setCommand(3, stereoOn, stereoOff);
        remoteControl.setCommand(4, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(5, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(5);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println("\n--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(6);
        System.out.println("\n--- Undo Macro ---");
        remoteControl.undoButtonWasPushed();
    }
}