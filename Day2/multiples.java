package Day2;

import java.util.*;
public class multiples {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number you want to see the multiples: ");
            int N = sc.nextInt();
            for(int i = 1; i <=10; i++)
            {
                System.out.println(N + " * " + i + " = " +(i*N));
            }
        }
    }
}  


