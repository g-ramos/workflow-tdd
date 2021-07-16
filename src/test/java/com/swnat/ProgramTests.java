package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgramTests {

    @Test
    public void programObjectStartsAsInDevelopment() {
        Program program = new Program();

        Assert.assertEquals(program.getStatus(), CurriculumSubjectStatus.IN_DEVELOPMENT);
    }

    @Test
    public void programStartEmpty() {
        Program program = new Program();

        Assert.assertEquals(program.getProgramTitle(), "");
        Assert.assertTrue(program.getCourses().isEmpty());

    }
}
