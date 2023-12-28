package com.example;

import com.example.command.CeilingFanHighCommand;
import com.example.command.CeilingFanMediumCommand;
import com.example.command.CeilingFanOffCommand;
import com.example.device.CeilingFan;
import com.example.invoker.RemoteControl;

public class App {
    public static void main(String[] args) throws Exception {
        RemoteControl rc = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand mediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);

        rc.setCommand(0, highCommand, offCommand);
        rc.setCommand(1, mediumCommand, offCommand);

    }
}
