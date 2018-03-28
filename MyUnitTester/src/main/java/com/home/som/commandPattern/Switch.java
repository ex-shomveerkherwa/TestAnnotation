package com.home.som.commandPattern;

public class Switch {
    BaseCommand upCommand , downCommand;

    public Switch(BaseCommand up , BaseCommand down){
        this.upCommand = up;
        this.downCommand = down;
    }

    void flipUp(){upCommand.execute();}
    void flipDown() {downCommand.execute();}
}
