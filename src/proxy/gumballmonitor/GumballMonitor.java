package proxy.gumballmonitor;

public class GumballMonitor {
    private final GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Location: " + machine.getLocation());
        System.out.println("Count: " + machine.getCount());
        System.out.println("State: " + machine.getState());
    }
}