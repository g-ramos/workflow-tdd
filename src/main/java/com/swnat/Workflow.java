package com.swnat;

public class Workflow {
    private CurriculumWorkflowStage stage;
    private WorkflowType type;

    public CurriculumWorkflowStage getStage() {
        return stage;
    }

    public Workflow(WorkflowType type) {
        this.stage = CurriculumWorkflowStage.CREATION_STAGE;
        this.type = type;
    }
}
