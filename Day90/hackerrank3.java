package Day90;

import java.util.*;

public class hackerrank3 {

    public static void main(String[] args) {
        int n,sum=0,c=0;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    sum = 0;
                    for(int k=i;k<=j;k++)
                    {
                        sum+=a[k];
                       
                    }
                     if(sum<0)c++;
                }
            }
        }
        System.out.print(c);
    }
    
}