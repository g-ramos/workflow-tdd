package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkflowTests {

    @Test
    public void courseWorkflowStartAtFirstStageAndTheSubjectIsEmpty() {
        Workflow courseWorkflow = new Workflow(WorkflowType.COURSE);

        Assert.assertEquals(courseWorkflow.getStage(), CurriculumWorkflowStage.CREATION_STAGE);
        Assert.assertTrue(courseWorkflow.getCourseSubject().isEmpty());
    }

    @Test
    public void programWorkflowStartAtFirstStageAndTheSubjectIsEmpty() {
        Workflow programWorkflow = new Workflow(WorkflowType.PROGRAM);

        Assert.assertEquals(programWorkflow.getStage(), CurriculumWorkflowStage.CREATION_STAGE);
        Assert.assertTrue(programWorkflow.getProgramSubject().isEmpty());
    }
}
