package com.stackroute.pe3;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String list=sc.next();
        ConsecutiveNumbers obj=new ConsecutiveNumbers();
        obj.isConsecutive(list);
    }
    public boolean isConsecutive(String list){
        String elements[]=list.split(",");
        int flag=0;
        for(int i=0;i<elements.length-1;i++){
            Integer number=Integer.parseInt(elements[i]);
            if(number+1==Integer.parseInt(elements[i+1])){
                flag=1;
            }
            else {
                flag = 0;
                break;
            }
        }
        if(flag==1)
            System.out.println(list +" "+"are consecutive numbers");
        else
            System.out.println(list +" "+ "are not consecutive numbers");
        return true;
    }
}
