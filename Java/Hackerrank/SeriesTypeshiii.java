import java.util.*;

class SeriesTypeshiii{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if (t >= 0 && t <= 500) {
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if (a>=0 && b>=0 && a<=50 && b <=50 && n>=1 && n<=15) {
                    for (int j = 0; j < n; j++) {
                        int h = 0;
                        for (int k = 0; k <= j; k++) {
                            h += (int)(b * Math.pow(2, k));
                        }
                        System.out.print(a+h + " ");
                    }
                }
                System.out.println();
            }
            
        }
        in.close();
    }
}
