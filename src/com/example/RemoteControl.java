package com.example;

import com.example.device.Light;
import com.example.device.TV;

public class RemoteControl {
    private String[] devices = new String[2];
    private Light light = new Light();
    private TV tv = new TV();

    public RemoteControl() {
        devices[0] = "Light";
        devices[1] = "TV";
    }

    public void execute(int row, String name) {
        String deviceName = devices[row];
        if (deviceName == "Light") {
            if (name == "on") {
                light.on();
            } else if (name == "off") {
                light.off();
            }
        } else if (deviceName == "TV") {
            if (name == "on") {
                tv.on();
            } else if (name == "off") {
                tv.off();
            }
        }
    }
}
