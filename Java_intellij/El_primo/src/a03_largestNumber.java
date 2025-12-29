public class a03_largestNumber {

    public static int lN(int blkid[]) {
        int bitch = Integer.MIN_VALUE;

        for (int i = 0; i < blkid.length; i++) {
            if (bitch < blkid[i]) {
                bitch = blkid[i];
            }
        }
        return bitch;
    }

    public static void main(String[] args) {
        int numero[] = {1,2,3,4,5,6,7,7,8,9,0};
        System.out.println("Largest nigga: " + lN(numero));
    }
}
