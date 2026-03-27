public class A1Q4 {
    public static void main(String[] args) {
        String s = "carbon";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 6; l++) {
                        for (int m = 0; m < 6; m++) {
                            for (int n = 0; n < 6; n++) {
                                if (i!=j && i!=k && i!=l && i!=m && i!=n &&
                                    j!=k && j!=l && j!=m && j!=n &&
                                    k!=l && k!=m && k!=n &&
                                    l!=m && l!=n &&
                                    m!=n) {
                                    System.out.println("" + s.charAt(i) + s.charAt(j) + s.charAt(k) 
                                                       + s.charAt(l) + s.charAt(m) + s.charAt(n));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}