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

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
