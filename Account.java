package oopsconcept;

public class Account{
    long accountnumber;
    String username;
   double accountbalance;

   public Account(long accountnumber, String username, double accountbalance) {
       this.accountnumber = accountnumber;
       this.username = username;
       this.accountbalance = accountbalance;
   }
}
class main {
   public static void main(String[] args) {
       Account account = new Account(123456789, "john", 100.0);
       System.out.println("Account Number: " + account.accountnumber);
       System.out.println("Username: " + account.username);
       System.out.println("Account Balance: " + account.accountbalance);
   }
}