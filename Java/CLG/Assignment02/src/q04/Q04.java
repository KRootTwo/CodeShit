// // Apart from constructor, the other instance methods are
// // • display ( ): To display the value of instance variables
// // • calc_amt( ): To calculate the total amount.
// // Total_amt = Principal + (Principal×rate×Time)/100;

class Deposit {
    long principal;
    int time;
    double rate;
    double total_amt ;

    Deposit () {
        this.principal = 100_000;
        this.rate = 4.6;
        this.time = 5;
    }
    Deposit (long principal, int time, double rate) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    Deposit (long principal, int time) {
        this.principal = principal;
        this.rate = 4.6;
        this.time = time; 
    }
    Deposit (long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
        this.time = 5;
    }
    void TotAmt (long principal, int time, double rate) {
        
    }
}
public class Q04 {
    public static void main(String[] args) {
        Deposit d[] = new Deposit[4];
        d[0] = new Deposit();
        d[1] = new Deposit(10000, 3.2);
        d[2] = new Deposit(10000, 4);
        d[3] = new Deposit(10000, 6, 3.5);
    }
}