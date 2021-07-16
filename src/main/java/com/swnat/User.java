package com.swnat;

public class User {
    private UserRole userRole;

    public User(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserRole getUserRole(){
        return userRole;
    }
    public void canSubmitWorkflow(Workflow workflow){
        if (userRole.equals(UserRole.DESIGNER)){
            workflow.advanceWorkflow();
        }
    }

    public void canCancelWorkflow(Workflow workflow){
        if (userRole.equals(UserRole.DESIGNER)){
            workflow.cancelWorkflow();
        }
    }
}
