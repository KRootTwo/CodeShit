import java.util.Scanner;

public class a01_arrays {





    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);

        // 1. Create Arrays
        int core[] = new int[100] ;

        // 2. Input Shite
        System.out.println("Entre Cores: ");
        core[0] = blehh.nextInt();
        core[1] = blehh.nextInt();
        core[2] = blehh.nextInt();

        // 3. Output Shite
        System.out.println("First Core: " + core[0]);
        System.out.println("Secon Core: " + core[1]);
        System.out.println("Third Core: " + core[2]);
        System.out.println();

        // 4. Update Shite
        core[2] = 9;
        core[1] += 2;

        System.out.println("First Core: " + core[0]);
        System.out.println("Secon Core: " + core[1]);
        System.out.println("Third Core: " + core[2]);

        // 5. Operations
        int per = (core[0]+core[1]+core[2])/3 ;
        int l = core.length;

        System.out.println(per);
        System.out.println(l);

    }
}
