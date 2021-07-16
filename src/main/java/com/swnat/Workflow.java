package com.swnat;

public class Workflow {
    private CurriculumWorkflowStage stage;
    private String type;

    public CurriculumWorkflowStage getStage() {
        return stage;
    }

    public Workflow(String type) {
        this.stage = CurriculumWorkflowStage.CREATION_STAGE;
        this.type = type;
    }
}
