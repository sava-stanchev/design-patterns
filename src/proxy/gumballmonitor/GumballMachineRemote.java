package proxy.gumballmonitor;

import state.gumballmachine.State;

public interface GumballMachineRemote {
    int getCount();
    String getLocation();
    State getState();
}