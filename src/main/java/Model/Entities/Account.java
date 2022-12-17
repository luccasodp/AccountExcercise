package Model.Entities;

import Model.WithdrawException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    
    public Account(){
        
    }
    public Account(Integer number, String holder, Double balance , Double withdrawLimit){
        this.number=number;
        this.holder=holder;
        this.balance=balance;
        this.withdrawLimit=withdrawLimit;
    }
    public void deposit(Double amount){
        balance +=amount;
    }
    public void withdraw(Double amount){
        if(amount>withdrawLimit){
            throw new WithdrawException("The amount exeeds withdraw limit");
        }
        if(amount>balance){
            throw new WithdrawException("Not enough balance");
        }
        balance -=amount;
    }

    @Override
    public String toString() {
        return  "New balance = " + balance;
    }
}
