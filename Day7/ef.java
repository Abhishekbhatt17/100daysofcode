package Day7;

import java.util.*;

    public class ef {

        public static void main(String[] args) {

            try (Scanner sc = new Scanner(System.in)) {
                int n=sc.nextInt();            
                String ans="";
                if(n%2==1){
                  ans = "Weird";
                }
                else {
                    if (n >= 2 && n <= 5) {
                        ans = "Not Weird";
                    } else if (n >= 6 && n <= 20) {
                        ans = "Weird";
                    } else {
                        ans = "Not Weird";
                    }
                    
                }
                System.out.println(ans);
            }
            
        }
    }    
