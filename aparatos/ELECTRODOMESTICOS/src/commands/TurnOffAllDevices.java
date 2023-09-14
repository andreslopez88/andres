package commands;
import java.util.List;

import devices.ElectronicDevice;

public class TurnOffAllDevices implements Command{

    List<ElectronicDevice> allDevices;

    public TurnOffAllDevices(List<ElectronicDevice> newDevices){
        allDevices = newDevices;

    }

    @Override
    public void execute() {
    for (ElectronicDevice devices : allDevices) {
        devices.off();
    }
    }

    @Override
    public void undo() {
    for (ElectronicDevice devices : allDevices) {
        devices.on();
    }
    
    
}

}
