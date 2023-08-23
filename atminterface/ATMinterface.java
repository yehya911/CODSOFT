package atminterface;

import java.util.*;

public class ATMinterface {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        BankAccount ba= new BankAccount(2000);
        ATM a= new ATM(ba);
        a.startATM();
    }
    
}
