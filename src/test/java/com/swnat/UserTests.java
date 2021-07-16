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

}
