// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import com.robtsai.*;
import com.robtsai.command.CommandRunner;
import com.robtsai.iterator.IteratorRunner;
import com.robtsai.mediator.MediatorRunner;
import com.robtsai.memento.MementoRunner;
import com.robtsai.observer.ObserverRunner;
import com.robtsai.state.StateRunner;
import com.robtsai.strategy.StrategyRunner;
import com.robtsai.template.TemplateRunner;
import com.robtsai.chainOfResponsibility.ChainRunner;

import javax.print.attribute.standard.MediaPrintableArea;

public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        var user = new User("rob");
        System.out.println(user.name);

        user.sayHello();

        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        var account = new Account();
        account.deposit(20);
        account.withdraw(5);
        System.out.println(account.getBalance());

        var mailService = new MailService();
        mailService.sendEmail();

        var textBox = new TextBox();
        textBox.enable();

        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());

        MementoRunner.runMemento();

        StateRunner.runState();

        IteratorRunner.runIterator();

        StrategyRunner.runStrategy();

        TemplateRunner.runTemplate();

        CommandRunner.runCommand();

        ObserverRunner.runObserver();

        MediatorRunner.runMediator();

        ChainRunner.runChain();

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }

}