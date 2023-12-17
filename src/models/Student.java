package models;


import java.util.Arrays;

public class Student {

    String name;
    int grade = 12;
    int age;

   int[] marks;

    public Student(String name, int age, int[] marks ) {
        this.name = name;
        this.age = age;
        this.marks = marks;

    }


    public void displayInformation(){
        String name = this.name;
        int age = this.age;
        int grade = this.grade;
        int[] marks = this.marks;

        System.out.println("The student is "+ name+" of age "+age+" from grade "+grade + " with the marks " + Arrays.toString(marks));
    }

}
