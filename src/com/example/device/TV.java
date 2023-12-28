package com.example.device;

public class TV {
    public void on() {
        System.out.println("Turn on.");
    }

    public void off() {
        System.out.println("Turn off.");
    }

    public void setInputChannel(int channel) {
        System.out.println("Set channel " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("Set volume " + volume);
    }
}
