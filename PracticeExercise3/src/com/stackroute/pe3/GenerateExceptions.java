package com.stackroute.pe3;

import java.util.Scanner;

public class GenerateExceptions {
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        GenerateExceptions obj=new GenerateExceptions();
        obj.generateNegativeArraySizeExceptions();
        obj.generateIndexOutOfBoundsExceptions();
        obj.generateNullPointerException();

    }

    public void generateNegativeArraySizeExceptions() throws NegativeArraySizeException{
        try{
            int arr[]=new int[-1];
        }
        catch(NegativeArraySizeException e){
            System.out.println(e);
        }
    }
    public void generateIndexOutOfBoundsExceptions() throws IndexOutOfBoundsException{
        try{
            int arr[]=new int[10];
            System.out.println(arr[11]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public void generateNullPointerException() throws  NullPointerException{
        String str=null;
        try{
            if(str.equals("ram")){
                System.out.println("ram");
            }
        }
        catch( NullPointerException e){
            System.out.println(e);
        }
    }


}
