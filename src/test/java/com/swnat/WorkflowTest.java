package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkflowTest {

    @Test
    public void startNewWorkflowForASubject() {
        Workflow workflow = new Workflow();

        Assert.assertNull(workflow.getSubject());
        // cuando se inicializa un WF debe estar en CREATION
        Assert.assertEquals(workflow.getStage(), WorkflowStage.CREATION);
    }

    @Test
    public void setSubjectInFirstStage() {
        Workflow workflow = new Workflow();
        WorkflowSubject workflowSubject = new Course("Code I", "Title I", CurriculumSubjectStatus.IN_DEVELOPMENT);

        workflow.setSubject(workflowSubject);

        Assert.assertEquals(workflow.getStage(), WorkflowStage.CREATION);
        Assert.assertEquals(((Course)workflow.getSubject()).getCourseCode(), "Code I");
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void cantSetSubjectIfNotFirstStage(){
        Workflow workflow = new Workflow();
        workflow.setStage(WorkflowStage.FEEDBACK);

        WorkflowSubject wotWorkflowSubject = new Course();

        workflow.setSubject(wotWorkflowSubject);
    }

    @Test
    public void advanceWorkflowToFeedback(){
        Workflow workflow = new Workflow();

        workflow.submit();

        Assert.assertEquals(workflow.getStage(),WorkflowStage.FEEDBACK);
    }
}
