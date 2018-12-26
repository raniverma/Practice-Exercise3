package com.stackroute.pe3;

public class ChessBoard {
    public static void main(String[] args) {
        ChessBoard obj=new ChessBoard();
        obj.printChessBoard();
    }
    public boolean printChessBoard(){
        String start="WW";
        String end="BB";
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                    System.out.print(start + "|");
                    String temp = start;
                    start = end;
                    end = temp;
            }
            String temp = start;
            start = end;
            end = temp;

            System.out.println();
        }
        return true;
    }
}
