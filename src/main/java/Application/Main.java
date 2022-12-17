package Application;

import Model.Entities.Account;
import java.util.Scanner;
import Model.WithdrawException;

public class Main {
    public static void main(String Args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("--- Enter account data ---");
            System.out.print("Number: ");
            int num = sc.nextInt();
            System.out.print("Holder: ");
            String hold = sc.nextLine();
            hold = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            double wl = sc.nextDouble();

            Account ac = new Account(num,hold,balance,wl);
            System.out.print("\nEnter amount for withdraw: ");
            ac.withdraw(sc.nextDouble());
            System.out.print(ac);
        }
        catch(WithdrawException e){
            System.out.println("Error in withdraw: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error: " + e.getMessage());
        }
        
    }
}
