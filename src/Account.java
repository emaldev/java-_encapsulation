public class Account {
    private String accountNumber;
    private double balance;

          public Account(String accountNumber){
              this.accountNumber = accountNumber;
              this.balance = 0.0;
          }
          public void deposit(double amount){
              if(amount > 0){
                  balance = balance + amount;
                  System.out.println("Deposit " + amount + "-> Balance :" + balance);
              }else {
                  System.out.println("Invalid amount !");
              }
          }
          public boolean widhdraw(double amount){
              if(amount > 0 && amount <= balance){
                  balance = balance - amount;
                  System.out.println("Withdraw " + amount + "-> Success! Balance :" + balance);
                  return true;
              }else {
                  System.out.println("Withdraw " + amount + "-> Failed! Insufficient balance.");
                  return false;
              }

          }
          public double gerBalance(){
              return balance;
          }
          public String gerAccountNumber(){
              return accountNumber;
          }

}

