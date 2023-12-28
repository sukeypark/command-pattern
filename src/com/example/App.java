package com.example;

import com.example.command.Command;
import com.example.command.LightOffCommand;
import com.example.command.LightOnCommand;
import com.example.command.StereoOffCommand;
import com.example.command.StereoOnWithCDCommand;
import com.example.device.Light;
import com.example.device.Stereo;
import com.example.invoker.RemoteControl;

public class App {
    public static void main(String[] args) throws Exception {
        RemoteControl rc = new RemoteControl();

        Light kitchenLight = new Light();
        LightOnCommand lightOn = new LightOnCommand(kitchenLight);
        LightOffCommand lightOff = new LightOffCommand(kitchenLight);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        rc.setCommand(0, lightOn, lightOff);
        rc.setCommand(1, stereoOn, stereoOff);
        rc.onButtonWasPressed(0);
        rc.offButtonWasPressed(0);
        rc.onButtonWasPressed(1);
        rc.offButtonWasPressed(1);
    }
}
