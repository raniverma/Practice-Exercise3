package com.stackroute.pe3;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int numOfRows=sc.nextInt();
        System.out.println("Enter number of Columns");
        int numOfCols=sc.nextInt();
        int [][] matrix1=new int[numOfRows][numOfCols];
        int [][] matrix2=new int[numOfRows][numOfCols];
        System.out.println("Enter Matrix1");
        for(int i=0;i<numOfRows;i++){
            for(int j=0;j<numOfCols;j++){
              matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix2");
        for(int i=0;i<numOfRows;i++){
            for(int j=0;j<numOfCols;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        Matrix obj=new Matrix();
        obj.MatrixAddition(numOfRows,numOfCols,matrix1,matrix2);
    }
    public boolean MatrixAddition(int numOfRows,int numOfCols,int matrix1[][],int matrix2[][]){
        int sumMatrix[][]=new int[numOfRows][numOfCols];
        for(int i=0;i<numOfRows;i++)
        {
            for(int j=0;j<numOfCols;j++)
            {
                sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Sum of two Matrices is:");
        for(int i=0;i<numOfRows;i++){
            for(int j=0;j<numOfCols;j++){
                System.out.print(sumMatrix[i][j]+" ");
            }
            System.out.println("");
        }
        return true;
    }
}
