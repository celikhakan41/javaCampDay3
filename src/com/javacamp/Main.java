package com.javacamp;

import com.javacamp.managers.InstructorManager;
import com.javacamp.managers.StudentManager;
import com.javacamp.managers.UserManager;
import com.javacamp.models.Instructor;
import com.javacamp.models.Student;
import com.javacamp.models.User;

public class Main {

    public static void main(String[] args) {
        Student student1=new Student();
        student1.setFullName("Muhammed Hakan CELIK");
        student1.setStudentId(1);
        student1.setPassword("hakan123");
        student1.setPhoneNumber("0507xxxxxxx");
        student1.setCourses("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        student1.setProgressScore(41);
        student1.setActive(true);
        student1.setSchoolName("Firat University");
        student1.setEmail("celikhakan41@yahoo.com");

        UserManager studentManager=new StudentManager();
        studentManager.addStudent(student1);

        //                             @@@@@@@@@@@   INSTRUCTOR @@@@@@@@@@@
        Instructor insturctor1=new Instructor();
        insturctor1.setInstructorId("12");
        insturctor1.setCourses("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        insturctor1.setFullName("Engin Demiroğ");
        insturctor1.setEmail("engin@gmail.com");
        insturctor1.setActive(true);
        insturctor1.setPassword("9999");

        UserManager userManager2=new InstructorManager();
        userManager2.addInstructor(insturctor1);

    }
}
