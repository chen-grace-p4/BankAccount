public class TesterBank {
  public static void main(String[]args) {
    BankAccount a1 = new BankAccount(100, "password");
    // a1.setPassword("newpass");
    // System.out.println(a1.getBalance());
    //System.out.println(a1.getAccountID());
    //
    // System.out.println("Withdrawal of $50:");
    // System.out.println(a1.withdraw(50));
    // System.out.println(a1.getBalance());
    //
    // System.out.println("Withdrawal of $70, should be false:");
    // System.out.println(a1.withdraw(70));
    // System.out.println(a1.getBalance());
    //
    // System.out.println("Withdrawal of $-50, should be false:");
    // System.out.println(a1.withdraw(-50));
    // System.out.println(a1.getBalance());
    //
    // System.out.println("Deposit of $80:");
    // System.out.println(a1.deposit(80));
    // System.out.println(a1.getBalance());
    //
    // System.out.println("Deposit of $-100:");
    // System.out.println(a1.deposit(-100));
    // System.out.println(a1.getBalance());

    //System.out.println(a1.toString());

    a1.setPassword("abc123");
    System.out.println(a1.authenticate("abc"));
    System.out.println(a1.authenticate("abc123"));
  }
}
