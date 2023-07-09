package com.robtsai.template;

public class TemplateRunner {
    public static void runTemplate() {
        var task = new TransferMoneyTask(new AuditTrail());
        task.execute();

        // we want execute to delegate and call doExecute of
        // subclass

        // we do not want to expose doExecute() directly to parent
        // class
    }
}
