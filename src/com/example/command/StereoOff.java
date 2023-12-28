package com.example.command;

import com.example.device.Stereo;

public class StereoOff implements Command {

    private Stereo stereo;

    @Override
    public void execute() {
        stereo.off();
    }

}
