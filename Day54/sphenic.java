package Day54;

import java.util.*;

public class sphenic {
    // create a global array of size 100000
    static boolean arr[] = new boolean[10000];

    // finds all the primes smaller than the limit
    static void findPrime() {
        Arrays.fill(arr, true);
        // iterate over all the numbers so that their multiples can be marked as
        // composite
        for (int p = 2; p * p < 10000; p++) {
            if (arr[p]) {
                // update all the multiples of p
                for (int i = p * 2; i < 10000; i = i + p)
                    arr[i] = false;
            }
        }
    }

    static int issphenic(int N) {
        int[] arr1 = new int[8];
        int count = 0;
        int j = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0 && count < 8) {
                count++;
                arr1[j++] = i;
            }
        }
        // checks that there is exactly 8 divisors or not and all the numbers are
        // distincit prime or not
        // if yes returns 1, else returns 0
        if (count == 8 && (arr[arr1[1]] && arr[arr1[2]] && arr[arr1[3]]))
            return 1;
        return 0;
    }

    public static void main(String args[]) {
        findPrime();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number to check: ");
            int n = sc.nextInt();
            int result = issphenic(n);
            if (result == 1)
                System.out.print("Yes, the given number is sphenic.");
            else
                System.out.print("No, the given number is not a sphenic.");
        }
    }
}