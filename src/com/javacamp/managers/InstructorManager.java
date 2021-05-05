package com.javacamp.managers;

import com.javacamp.models.Instructor;

public class InstructorManager extends UserManager {


    public void addInstructor(Instructor instructor){
        System.out.print(instructor.getInstructorId()+" "+
                instructor.getFullName()+" "+
                instructor.getCourses()+" "+
                instructor.getEmail());
        System.out.println(" (instructor) added");
    }

}
