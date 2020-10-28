public class TesterBank {
  public static void main(String[]args) {
    BankAccount a1 = new BankAccount(100, 12345, "password");
    a1.setPassword("newpass");
    System.out.println(a1.getBalance());
    System.out.println(a1.getAccount());

    System.out.println("Withdrawal of $50:");
    System.out.println(a1.withdraw(50));
    System.out.println(a1.getBalance());

    System.out.println("Withdrawal of $70, should be false:");
    System.out.println(a1.withdraw(70));
    System.out.println(a1.getBalance());

    System.out.println("Withdrawal of $-50, should be false:");
    System.out.println(a1.withdraw(-50));
    System.out.println(a1.getBalance());

    System.out.println("Deposit of $80:");
    System.out.println(a1.deposit(80));
    System.out.println(a1.getBalance());

    System.out.println("Deposit of $-100:");
    System.out.println(a1.deposit(-100));
    System.out.println(a1.getBalance());
  }
}
