class Account{
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){
        if(amount>=0 && amount<=balance){
            balance-=amount;
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withdraw(300);
        System.out.println(account.getBalance());
    }
}
