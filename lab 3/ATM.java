public class ATM {
    double balance = 0;
    withdraw w = new withdraw();
    deposit d = new deposit();
    public double doingWork(int x, double amount) {
        switch(x)
        {
            case 1:
                this.balance =w.withdraw(amount,balance);
            case 2:
                this.balance = d.deposit(amount,balance);
        }return balance;}
    public static void main(String args[] ) {
    }

}
