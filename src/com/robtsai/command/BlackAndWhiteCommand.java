package com.robtsai.command;

import com.robtsai.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("converting to black and white");
    }
}
