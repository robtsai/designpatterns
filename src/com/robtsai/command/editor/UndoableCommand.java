package com.robtsai.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
