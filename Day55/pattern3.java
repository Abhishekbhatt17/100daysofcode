package Day55;

public class pattern3 {
    public static void Number(int n) {
        for (int i = 1; i<=n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j+" ");


            }
            System.out.println();


        }
        for (int i = n-1; i>=1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j+" ");


            }
            System.out.println();


        }
    }
    public static void main(String[] args) {
        Number(6);
    }
}