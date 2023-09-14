import devices.ElectronicDevice;

public class TurnOffTelevicion implements Command {
    private ElectronicDevice device;
    public TurnOffTelevicion(ElectronicDevice device){
        this.device=device;
    }
     @Override
     public void execute() {
     device.on();
     }  
     
     @Override
     public void undo() {
       device.off();
     } 
}
