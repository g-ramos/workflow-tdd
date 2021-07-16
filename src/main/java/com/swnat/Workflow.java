package com.swnat;

public class Workflow {
    private Course subject;
    private WorkflowStage stage;

    public Workflow() {
        subject = new Course();
        stage = WorkflowStage.CREATION;
    }


    public Course getSubject() {
        return subject;
    }

    public WorkflowStage getStage() {
        return stage;
    }
}

