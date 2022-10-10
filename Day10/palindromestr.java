package Day10;

import java.util.*;

public class palindromestr {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String A=sc.next();

            
            
            boolean palindrome = true;
            
            for(int i = 0; i<A.length()/2;i++)
            {
                if(!A.substring(i,i+1).equals(A.substring(A.length()-i-1,A.length()-i)))
                {
                    palindrome = false;
                }
            }
            if(palindrome){System.out.println("Yes");}
            else{System.out.println("No");}
        }
        
        
    }
}