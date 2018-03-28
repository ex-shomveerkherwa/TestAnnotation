package com.home.som.commandPattern;

public class FanOnCommand implements BaseCommand {
    Fan myFan;

    public FanOnCommand(Fan f){
        this.myFan = f;
    }

    public void execute() {
        myFan.startRotate();
    }
}
