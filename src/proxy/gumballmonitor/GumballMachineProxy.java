package proxy.gumballmonitor;

import state.gumballmachine.GumballMachine;
import state.gumballmachine.State;

public class GumballMachineProxy implements GumballMachineRemote {
    private final GumballMachine machine;

    public GumballMachineProxy(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public int getCount() {
        System.out.println("[Proxy] getting count");
        return machine.getCount();
    }

    @Override
    public String getLocation() {
        System.out.println("[Proxy] getting location");
        return machine.getLocation();
    }

    @Override
    public State getState() {
        System.out.println("[Proxy] getting state");
        return machine.getState();
    }
}