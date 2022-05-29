package com.company;

public class Task2 {
    public static void generateException(int what){
        int f;
        int numbers[] = new int[2];
        System.out.println("Input your value" + what);
        try{
            switch (what){
                case 0:
                    f = 10/what;
                    break;
                case 1:
                    numbers[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero");
            return;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(("There is no such index in the array"));
        }
        finally{
            System.out.println("These code will always be used");
        }
    }
}
class FinallyDemo{
    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            Task2.generateException(i);
            System.out.println();
        }
    }
}
