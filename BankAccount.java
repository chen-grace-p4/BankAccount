public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int accountID, String password) {
    this.accountID = accountID;
    this.password = password;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

//don't read the password, just change it to maintain security
  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if (amount <= balance && amount >= 0) {
      balance -= amount;
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    String retstring = "";
    retstring += "#" + accountID + "\t" + "$" + balance;
    return retstring;
  }

  private boolean authenticate (String password) {
    return password.equals(this.password);
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (this.authenticate(password)) {
      if (this.withdraw(amount)) {
        other.deposit(amount);
        return true;
      }
    }
    return false;
  }
}
