package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkflowTests {

    @Test
    public void courseWorkflowStartAtFirstStageAndTheSubjectIsEmpty() {
        Workflow courseWorkflow = new Workflow("Course");

        Assert.assertEquals(courseWorkflow.getStage(), CurriculumWorkflowStage.CREATION_STAGE);

    }
}
