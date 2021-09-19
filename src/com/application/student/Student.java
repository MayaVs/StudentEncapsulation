package com.application.student;

public class Student {
    private String name;
    private Grade grade;
    private Group group;
    private String secretNickName;

    public Student(String name, Group group, Grade grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;

        this.secretNickName = "MySecretNickName";
    }
     public String getName(){
        return this.name;
     }

     public Grade getGrade(){
        return this.grade;
     }

     public void upgrade(){
        int newGradeInd = this.grade.ordinal() - 1;
        this.grade = Grade.values()[newGradeInd > 0 ? newGradeInd : 0];
     }

     public void downgrade(){
         int newGradeInd = this.grade.ordinal() + 1;
         this.grade = Grade.values()[newGradeInd >= Grade.values().length ? Grade.values().length-1 : newGradeInd];
     }

     public String getGroup(){
        return this.group.name();
     }

}
