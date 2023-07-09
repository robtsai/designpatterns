package com.robtsai.command.editor;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        // what if no history?
        if (history.size() > 0)
            history.pop().unexecute();
    }
}
