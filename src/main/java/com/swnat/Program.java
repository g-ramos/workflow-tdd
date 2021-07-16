package com.swnat;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String programTitle;
    private CurriculumSubjectStatus programStatus;
    private List<Course> courses;

    public Program() {
        this.programTitle = "";
        this.courses = new ArrayList<>();
        this.programStatus = CurriculumSubjectStatus.IN_DEVELOPMENT;
    }

    public CurriculumSubjectStatus getStatus() {
        return programStatus;
    }

    public String getProgramTitle() {
        return programTitle;
    }

   public List<Course> getCourses() {
        return courses;
   }

   public boolean isEmpty() {
       if (programTitle.isEmpty() && courses.isEmpty()){
           return true;
       }
       return false;
   }
}
