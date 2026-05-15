package q04;

class Deposit {
    long principal;
    int time;
    double rate;
    double total_amt ;

    Deposit () {
        this.principal = 100_000;
        this.rate = 4.6;
        this.time = 5;
        this.total_amt = TotAmt(100_000, 5, 4.6);
    }
    Deposit (long principal, int time, double rate) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.total_amt = TotAmt(principal, time, rate);
    }
    Deposit (long principal, int time) {
        this.principal = principal;
        this.rate = 4.6;
        this.time = time; 
        this.total_amt = TotAmt(principal, time, 4.6);
    }
    Deposit (long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
        this.time = 5;
        this.total_amt = TotAmt(principal, 5, rate);
    }
    double TotAmt (long principal, int time, double rate) {
        return (principal + (principal * rate * time) / 100);
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