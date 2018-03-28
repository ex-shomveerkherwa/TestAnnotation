package com.home.som.commandPattern;

public class FanOffCommand implements BaseCommand{
    Fan myFan;

    public FanOffCommand(Fan f){
        this.myFan = f;
    }

    public void execute() {
        myFan.stopRotate();
    }
}
