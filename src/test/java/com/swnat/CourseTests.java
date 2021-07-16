package com.swnat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CourseTests {

    @Test
    public void courseObjectStartsAsInDevelopment() {
        Course course = new Course();

        Assert.assertEquals(course.getStatus(), CurriculumSubjectStatus.IN_DEVELOPMENT);
    }

    public void courseStartWithEmptyValues(){
        Course course = new Course ();
        Assert.assertEquals(course.getCourseCode(), "");
        Assert.assertEquals(course.getCourseTitle(), "");
    }
}
