package com.home.som.commandPattern;

public class LightOnCommand implements BaseCommand {

    Light myLight;

    public LightOnCommand(Light l){
        this.myLight= l;
    }

    public void execute() {
        myLight.turnOn();
    }
}
