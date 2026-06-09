public class Banck {
    public static void main(String[] args) {
    Account bankAccount = new Account("IR0123456789");

    System.out.println("Account :" + bankAccount.gerAccountNumber());
    bankAccount.deposit(500);
    bankAccount.widhdraw(200);
    bankAccount.widhdraw(400);

    System.out.println("Final Balance :"+ bankAccount.gerBalance());
    }
}
