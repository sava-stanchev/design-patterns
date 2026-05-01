package proxy.gumballmonitor;

import state.gumballmachine.GumballMachine;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine("Sofia Mall", 5);
        GumballMonitor monitor = new GumballMonitor(machine);

        monitor.report();

        machine.insertQuarter();
        machine.turnCrank();

        monitor.report();
    }
}