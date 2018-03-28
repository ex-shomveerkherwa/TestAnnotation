package com.home.som.commandPattern;

public class LightOffCommand implements BaseCommand {
    Light myLight ;

    public LightOffCommand(Light l){
        this.myLight=l;
    }


    public void execute() {
        myLight.turnOff();
    }
}
