package com.swnat;

public class Workflow {
    private WorkflowStage stage;
    private WorkflowSubject subject;

    public Workflow () {
        stage = WorkflowStage.CREATION;
    }

    public WorkflowStage getStage() {
        return stage;
    }

    public void setStage(WorkflowStage stage) {
        this.stage = stage;
    }

    public WorkflowSubject getSubject() {
        return subject;
    }

    public void setSubject(WorkflowSubject subject) throws IllegalStateException{
        if (!WorkflowStage.CREATION.equals(this.stage)) {
            throw new IllegalStateException ("Only Workflows In Creation can be updated");
        }
        this.subject = subject;
    }

    public void submit() {
        if(WorkflowStage.CREATION.equals(stage)){
            stage=WorkflowStage.FEEDBACK;
        }
    }
}
