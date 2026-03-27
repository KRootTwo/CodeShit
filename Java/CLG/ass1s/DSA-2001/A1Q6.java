import java.util.*;
public class A1Q6 {
   public static boolean isOdd(int n) {
    int sumo = 1;
    while (sumo <= n) {
        if (sumo == n) {
            return true;
        }
        sumo += 2;
    }
    return false;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


    }
    
}
