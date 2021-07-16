package com.swnat;

public class Workflow {
    private CurriculumWorkflowStage stage;
    private WorkflowType type;
    private Course courseSubject;
    private Program programSubject;

    public CurriculumWorkflowStage getStage() {
        return stage;
    }

    public Course getCourseSubject() {
        return courseSubject;
    }

    public Program getProgramSubject() {
        return programSubject;
    }

    public Workflow(WorkflowType type) {
        this.stage = CurriculumWorkflowStage.CREATION_STAGE;
        this.type = type;
        if (WorkflowType.COURSE.equals(type)){
            this.courseSubject = new Course();
        } else if (WorkflowType.PROGRAM.equals(type)){
            this.programSubject = new Program();
        }
    }
}
