package com.robtsai.template;

public class TransferMoneyTask extends Task {


    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }


    @Override
    protected void doExecute() {
        System.out.println("transfering money");
    }
}


//    NO LONGER need auditTrail as private field
//    private AuditTrail auditTrail;


//     NO LONGER NEEDED - implemented in base class
//    public void execute() {
//        auditTrail.record();
//    }
