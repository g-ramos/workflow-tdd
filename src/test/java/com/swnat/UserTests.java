package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTests {

    @Test
    public void designerCanCreateWorkflow(){
        User user = new User(UserRole.DESIGNER);
        Workflow workflow = user.createWorkflow();

        Assert.assertNotNull(workflow);
        Assert.assertEquals(workflow.getStage(), WorkflowStage.CREATION);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void  onlyDesignerCanCreateWorkflow(){
        User user = new User(UserRole.REVIEWER);
        Workflow workflow = user.createWorkflow();

    }

    @Test
    public void designerCanChangeSubject(){
        User user = new User(UserRole.DESIGNER);
        Workflow workflow = new Workflow();
        WorkflowSubject workflowSubject = new Course("test 001","test",CurriculumSubjectStatus.IN_DEVELOPMENT);

        Workflow updatedWorkflow = user.changeWorkflowSubject(workflow,workflowSubject);

        Assert.assertEquals(((Course)updatedWorkflow.getSubject()).getCourseCode(),"test 001");
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void onlyDesignerCanChangeWorkflowSubject(){
        User user = new User(UserRole.REVIEWER);
        Workflow workflow = new Workflow();
        WorkflowSubject workflowSubject = new Course("test 001","test",CurriculumSubjectStatus.IN_DEVELOPMENT);

        Workflow updatedWorkflow = user.changeWorkflowSubject(workflow,workflowSubject);

    }

    @Test
    public void designerCanSubmitWorkflow(){
        User user = new User(UserRole.DESIGNER);
        Workflow workflow = new Workflow();

        Workflow submittedWorkflow = user.submitWorkflow(workflow);

        Assert.assertEquals(submittedWorkflow.getStage(),WorkflowStage.FEEDBACK);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void onlyDesignerCanSubmitWorkflow(){
        User user = new User(UserRole.REVIEWER);
        Workflow workflow = new Workflow();

        Workflow submittedWorkflow = user.submitWorkflow(workflow);

    }

    @Test
    public void designerCanCancelWorkflow(){
        User user = new User(UserRole.DESIGNER);
        Workflow workflow = new Workflow();

        boolean result = user.cancelWorkflow(workflow);

        Assert.assertTrue(result);

    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void onlyDesignerCanCancelWorkflow() {
        User user = new User(UserRole.REVIEWER);
        Workflow workflow = new Workflow();

        boolean result = user.cancelWorkflow(workflow);
    }
}
