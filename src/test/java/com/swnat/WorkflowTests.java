package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkflowTests {

    @Test
    public void subjectIsInDevelopmentWhenCreatingWorkflow() {
        Workflow workflow = new Workflow();
        Assert.assertEquals(workflow.getSubject().getStatus(), CurriculumSubjectStatus.IN_DEVELOPMENT);
    }


    @Test
    public void workflowIsInCreation() {
        Workflow workflow = new Workflow();
        Assert.assertEquals(workflow.getStage(), WorkflowStage.CREATION);
    }

    @Test
    public void valuesCanChangeIfStageIsCreation() {
        Workflow workflow = new Workflow();
        // workflow.setStage(WorkflowStage.FEEDBACK);

        Course course = new Course();
        course.setCourseCode("001");
        course.setCourseTitle("new title");

        workflow.changeCourseValues(course);

        Assert.assertEquals(workflow.getSubject().getCourseCode(), course.getCourseCode());
        Assert.assertEquals(workflow.getSubject().getCourseTitle(), course.getCourseTitle());

    }

}
