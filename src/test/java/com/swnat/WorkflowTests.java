package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkflowTests {

    @Test
    public void subjectIsEmptyWhenCreatingWorkflow() {
        Workflow workflow = new Workflow();
        Course courseToCompare = new Course();
        Assert.assertEquals(workflow.getSubject().getStatus(), courseToCompare.getStatus());
    }
}
