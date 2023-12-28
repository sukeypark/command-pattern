package com.example.command;

import com.example.device.Stereo;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolumne();
    }

    @Override
    public void undo() {
        stereo.withdrawCD();
        stereo.removeVolume();
        stereo.off();
    }

}
