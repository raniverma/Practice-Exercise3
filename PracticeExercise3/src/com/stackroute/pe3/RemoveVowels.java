package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of places");
        int numOfPlaces=sc.nextInt();
        System.out.println("Enter the places");
        String places[]=new String[numOfPlaces];

        for(int i=0;i<numOfPlaces;i++){
            places[i]=sc.next();
        }
        RemoveVowels obj =new RemoveVowels();
        obj.removeVowels(numOfPlaces,places);
    }
    public boolean removeVowels(int numOfPlaces,String places[]){
        for(int i=0;i<numOfPlaces;i++){
           // System.out.println(place);
            String place="";
            for(int j=0;j<places[i].length();j++){
                if(places[i].charAt(j)=='a'||places[i].charAt(j)=='e'||places[i].charAt(j)=='i'||
                        places[i].charAt(j)=='o'||places[i].charAt(j)=='u'||places[i].charAt(j)=='A'||
                        places[i].charAt(j)=='E'||places[i].charAt(j)=='I'||places[i].charAt(j)=='O'||
                        places[i].charAt(j)=='U'){
                   continue;
                }
                else
                    place+=places[i].charAt(j);
            }
            System.out.println("Place Name without Vowels:"+i+" "+ place);
           // StringBuilder sb=new StringBuilder(place);
            StringBuffer sb=new StringBuffer(place);
            sb.delete(0, sb.length());
        }
        return true;
    }
}
