package com.company;

import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Account Customer1 = new Account( "Ralph", "0000 3456 7654 7896 7654", 2000);
        Account Customer2 = new Account( "Mary", "0000 2637 6456 3746 3763", 3500);
        try{
            Customer2.Transfer(4000);
        }
        catch(NotEnoughMoneyException e){
            System.out.println();
        }
        finally {
            System.out.println("The Amount left in your Account is:" +Customer2.Balance);
        }
    }
}

class Account{
    String Owner,Acc_Number;
    int Balance;

    public void Transfer(int amount)  throws NotEnoughMoneyException {
        if(Balance>amount){
            Balance = amount;
        }
        else{
            throw new NotEnoughMoneyException("There is not enough money in your account");
        }
    }
    public Account(String Owner, String Acc_Number, int Balance){
        this.Owner= Owner;
        this.Acc_Number= Acc_Number;
        this.Balance= Balance;
    }

    public String getOwner() {return Owner;}
    public String getAcc_Number() {return Acc_Number;}
    public int getBalance() {return Balance;}

    public void setOwner(String T) {this.Owner = T;}
    public void setAcc_Number(String T) {this.Acc_Number = T;}
    public void setBalance(int T) {this.Balance = T;}

}

