package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkflowTests {

    @Test
    public void subjectIsEmptyWhenCreatingWorkflow() {
        Workflow workflow = new Workflow();

        Assert.assertEquals(workflow.getSubject(), null);
    }
}
