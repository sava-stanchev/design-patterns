package state.gumballmachine;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine("Sofia Mall", 2);

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        machine.refill(5);

        machine.insertQuarter();
        machine.turnCrank();
    }
}