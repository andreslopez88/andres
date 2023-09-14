import java.util.ArrayList;
import java.util.List;

import commands.TurnOffAllDevices;
import commands.TurnOffRadio;
import commands.TurnOffTelevision;
import commands.TurnOnRadio;
import commands.TurnOnTelevision;
import commands.VolumeDownRadio;
import commands.VolumeDownTelevision;
import commands.VolumeUpRadio;
import commands.VolumeUpTelevision;
import devices.DeviceButton;
import devices.ElectronicDevice;
import devices.Radio;
import devices.Television;

public class App {



    public static void main(String[] args) throws Exception {
        ElectronicDevice televisionOne = new Television("SAMSUNG");

        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);

        onPressed = new DeviceButton(offCommand);
        onPressed.pressUndo();

        VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);

        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        VolumeDownTelevision volDownCommand = new VolumeDownTelevision(televisionOne);
        
        onPressed = new DeviceButton(volDownCommand);
        onPressed.press();


    
        ElectronicDevice radioOne = new Radio("CHALLENGER");

        TurnOnRadio onCommand1 = new TurnOnRadio(radioOne);

        DeviceButton onPressed1;
        onPressed1 = new DeviceButton(onCommand1);
        onPressed1.press();

        TurnOffRadio offCommand1 = new TurnOffRadio(radioOne);

        onPressed1 = new DeviceButton(offCommand1);
        onPressed1.pressUndo();

        VolumeUpRadio volUpCommand1 = new VolumeUpRadio(radioOne);

        onPressed1 = new DeviceButton(volUpCommand1);
        onPressed1.press();
        onPressed1.press();
        onPressed1.press();

        VolumeDownRadio volDownCommand1 = new VolumeDownRadio(radioOne);
        
        onPressed1 = new DeviceButton(volDownCommand1);
        onPressed1.press();
        onPressed1.press();

        Television televisionTwo = new Television("HUAWEI");
        Radio radioOne2 = new Radio("SONY");

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(televisionTwo);
        allDevices.add(radioOne2);

        TurnOffAllDevices turnOffAllDevices = new TurnOffAllDevices(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffAllDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();
        

    }
}

    



