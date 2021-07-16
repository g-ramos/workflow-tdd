package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTests {
    @Test
    public void userHasRole() {
        User user = new User(UserRole.DESIGNER);
        Assert.assertEquals(user.getUserRole(), UserRole.DESIGNER);
    }

    @Test
    public void userCanSubmitWorkflow() {
        User user = new User(UserRole.DESIGNER);
        Workflow workflow = new Workflow();
        user.canSubmitWorkflow(workflow);
        Assert.assertEquals(workflow.getStage(), WorkflowStage.FEEDBACK);
    }

    @Test
    public void userCanCancelWorkflow() {
        User user = new User(UserRole.DESIGNER);
        Workflow workflow = new Workflow();
        user.canCancelWorkflow(workflow);
        Assert.assertEquals(workflow.getStage(), WorkflowStage.CANCELED);
    }
}


