package com.application.student;

import com.application.student.gradeEnum;
import com.application.student.groupEnum;

public class Main {

    public static void main(){
        Student mark = new Student("Mark", groupEnum.values()[0], gradeEnum.values()[0]);

        System.out.println(mark.getName());
        System.out.println(mark.getClass());
        System.out.println(mark.getGrade());

    }
}
