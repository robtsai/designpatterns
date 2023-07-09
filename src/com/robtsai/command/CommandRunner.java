package com.robtsai.command;

import com.robtsai.command.editor.BoldCommand;
import com.robtsai.command.editor.History;
import com.robtsai.command.editor.HtmlDocument;
import com.robtsai.command.editor.UndoCommand;
import com.robtsai.command.fx.Button;

public class CommandRunner {
    public static void runCommand() {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();


        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }
}
