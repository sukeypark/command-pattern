package com.example;

import com.example.command.Command;
import com.example.command.LightOnCommand;
import com.example.device.Light;
import com.example.invoker.RemoteControl;

public class App {
    public static void main(String[] args) throws Exception {
        Command command = new LightOnCommand(new Light());
        RemoteControl rc = new RemoteControl();

        rc.setCommand(command);
        rc.buttonWasPressed();
    }
}
