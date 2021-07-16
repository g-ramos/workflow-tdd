package com.swnat;

public class User {
    private UserRole role;

    public UserRole getRole() {
        return role;
    }

    public User(UserRole role){
        this.role=role;
    }

    public Workflow createWorkflow() throws IllegalStateException {
        if (UserRole.DESIGNER.equals(role)) {
            return new Workflow();
        }
        throw new IllegalStateException("Only users with role Designer can start a Workflow");
    }

    public Workflow changeWorkflowSubject(Workflow workflow, WorkflowSubject workflowSubject) throws IllegalStateException {
        if (UserRole.DESIGNER.equals(role)) {
            workflow.setSubject(workflowSubject);
            return workflow;
        }
        throw new IllegalStateException("Only users with role Designer can change Workflow Subject");
    }

    public Workflow submitWorkflow(Workflow workflow) throws IllegalStateException{
        if (!UserRole.DESIGNER.equals(role)) {
            throw new IllegalStateException("Only users with role Designer can submit a Workflow");
        }
        workflow.submit();
        return workflow;
    }
}
