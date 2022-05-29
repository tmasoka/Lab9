package com.company;

public class NullPointer {
    public static void main(String[] args){

        String a = null;
        System.out.println((a.toString()));

        int num1,num2;
        try{
            num1 = 0;
            num2 = 5;
            System.out.println(num2);
            System.out.println("End of This Block");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

    }
}




