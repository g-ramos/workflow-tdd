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

    public void setStage(WorkflowStage stage) {
        this.stage = stage;
    }


    public void changeCourseValues (Course course){
        if (stage == WorkflowStage.CREATION){
            subject.setCourseTitle(course.getCourseTitle());
            subject.setCourseCode(course.getCourseCode());
        }
    }

    public void advanceWorkflow() {
        if (stage == WorkflowStage.CREATION){
            stage = WorkflowStage.FEEDBACK;
        }
    }
}

