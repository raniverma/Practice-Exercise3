package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMarks {
    private int numOfStudents;
    private int stuGrades[];

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int[] getStuGrades() {
        return stuGrades;
    }

    public void setStuGrades(int[] stuGrades) {
        int flag=0;
      //  List<Integer> grades=new ArrayList<>();
        for(int i=0;i<stuGrades.length;i++) {
            if (stuGrades[i] >= 0 && stuGrades[i] <= 100) {
                flag=1;
            }
            else {
                flag=0;
             //   grades.add(stuGrades[i]);
            }
        }
        if(flag==1)
            this.stuGrades = stuGrades;
        else{
           // this.stuGrades = stuGrades;
          // for(int i=0;i<grades.size();i++) {
                System.out.println("error,grades shoud be between 0 and 100");
            //}
        }
    }

    public static void main(String args[]){
        StudentMarks obj=new StudentMarks();
        Scanner sc=new Scanner(System.in);
        obj.setNumOfStudents(sc.nextInt());
        int stuGrades[]=new int[obj.getNumOfStudents()];
        for(int i=0;i<obj.getNumOfStudents();i++){
            stuGrades[i]=sc.nextInt();
        }
        obj.setStuGrades(stuGrades);
    }

}
