package com.javacamp.managers;

import com.javacamp.models.Instructor;
import com.javacamp.models.Student;
import com.javacamp.models.User;

public class StudentManager extends UserManager{

    public void addStudent(Student student){
        System.out.print(student.getStudentId()+" "+
                student.getFullName()+" "+
                student.getSchoolName()+" "+
                student.getCourses()+" "+
                student.getEmail()+" "+
                student.getProgressScore());
        System.out.println(" (student) added");
    }
}
