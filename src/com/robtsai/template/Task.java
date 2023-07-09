package com.robtsai.template;

// nned to mark as abstract
public abstract class Task {
    private AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        doExecute();
    }

    // hide this (private methods not inherited)
    // use protected keyword

    protected abstract void doExecute();

}
