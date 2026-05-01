package proxy.gumballmonitor;

import state.gumballmachine.GumballMachine;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine("Sofia Mall", 5);
        GumballMachineRemote proxy = new GumballMachineProxy(machine);
        GumballMonitor monitor = new GumballMonitor(proxy);

        monitor.report();

        machine.insertQuarter();
        machine.turnCrank();

        monitor.report();
    }
}