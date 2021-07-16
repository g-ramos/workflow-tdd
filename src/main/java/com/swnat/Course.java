package com.swnat;

public class Course {

    private String courseCode;
    private String courseTitle;
    private CurriculumSubjectStatus courseStatus;

    public Course() {
        this.courseCode = "";
        this.courseTitle = "";
        this.courseStatus = CurriculumSubjectStatus.IN_DEVELOPMENT;
    }

    public CurriculumSubjectStatus getStatus() {
        return courseStatus;
    }
}
