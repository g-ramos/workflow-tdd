package com.swnat;

public class Workflow {
    private WorkflowStage stage;
    private WorkflowSubject subject;
    private boolean deleted = false;

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
    
    public boolean isDeleted(){
        return deleted;
    }

    public boolean cancel() throws IllegalStateException {
        if(!WorkflowStage.CREATION.equals(stage)){
            throw new IllegalStateException();
        }
        deleted = true;

        return deleted;
    }
}
