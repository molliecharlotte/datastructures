package lab2;

public class Program {
    public static void main(String[] args) {
        throw new UnsupportedOperationException();
        
        Bank bank = new Bank();
        
        int accountNo = bank.openAccount().getAccountNumber();
        
        Account account = bank.getAccount(accountNo);
        
        account.deposit(100);
        System.out.println("Account balance should be 100.");
        System.out.println(account.getBalance());
    }
}
