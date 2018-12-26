package com.stackroute.pe3;

public class CreateException extends Exception {

    public CreateException(String s) {
        super(s);
    }

    public static void main(String[] args)  {
        try{
            throw new CreateException("my new exception");
        }
        catch (CreateException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("finally block");
        }
    }

}
