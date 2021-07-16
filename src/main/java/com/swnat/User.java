package com.swnat;

public class User {
    private CurriculumRole role;

    public CurriculumRole getRole() {
        return role;
    }

    public User(CurriculumRole role) {
        this.role = role;
    }

    public boolean canEdit(Workflow workflow){
        if (CurriculumWorkflowStage.CREATION_STAGE.equals(workflow.getStage())
                && CurriculumRole.DESIGNER.equals(this.role)){
            return true;
        }
        return false;
    }
}
