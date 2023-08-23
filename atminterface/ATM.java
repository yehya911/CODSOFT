package atminterface;

import java.util.*;

public class ATM {
    Scanner input= new Scanner(System.in);
    BankAccount ba;

    public ATM(BankAccount ba) {
        this.ba = ba;
    }
    
    public void startATM(){
        OUTER:
        while(true){
            System.out.println("Please select an action: ");
            System.out.println("1 - View Balance.\n2 - Withdraw Funds.\n3 - Deposit Funds.\n4 - Exit.");
            int action= input.nextInt();
            switch (action){
                case 1:
                    System.out.println("Your current balance is: "+ba.getBalance()+"\n");
                    break;
                case 2:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdraw= input.nextDouble();
                    if(withdraw <= ba.getBalance()){
                        ba.setBalance(ba.getBalance()-withdraw);
                        System.out.println("Withdraw succesfull, your current balance is: "+ba.getBalance()+"\n");
                    }
                    else{
                        System.out.println("The amount you are trying to withdraw is invalid(insufficient funds).\n");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount you want to deposit: ");
                    double deposit= input.nextDouble();
                    if(deposit <= 0){
                        System.out.println("The deposit amount you entered is invalid.\n");
                    }
                    else{
                        ba.setBalance(ba.getBalance()+deposit);
                        System.out.println("Deposit succesfull, your current balance is: "+ba.getBalance()+"\n");
                    }
                    break;
                case 4:
                    break OUTER;
                default:
                    System.out.println("Please select a valid action.");
            }
        }
    }
}
