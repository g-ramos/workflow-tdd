package com.swnat;

public class Course implements WorkflowSubject{
        private String courseCode;
    private String courseTitle;
    private CurriculumSubjectStatus courseStatus;

    public Course() {
        this.courseCode = "";
        this.courseTitle = "";
        this.courseStatus = CurriculumSubjectStatus.IN_DEVELOPMENT;
    }

    public Course(String courseCode, String courseTitle, CurriculumSubjectStatus courseStatus) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseStatus = courseStatus;
    }

    public CurriculumSubjectStatus getStatus() {
        return courseStatus;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
}
