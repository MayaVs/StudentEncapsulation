package com.application.student;

public class Main {

    public static void main(String[] args){
        Student mark = new Student("Mark", Group.FIRST, Grade.A);

        System.out.println(mark.getName());
        System.out.println(mark.getGroup());
        System.out.println(mark.getGrade());
        mark.upgrade();
        System.out.println(mark.getGrade());
        mark.downgrade();
        System.out.println(mark.getGrade());
        mark.downgrade();
        System.out.println(mark.getGrade());
        mark.downgrade();
        System.out.println(mark.getGrade());
        mark.downgrade();
        System.out.println(mark.getGrade());
        mark.downgrade();
        System.out.println(mark.getGrade());
        mark.downgrade();
        System.out.println(mark.getGrade());

    }
}
