package Day35;

public class stringrange{

    public static void main(String[] args) {
     
       String str = "Abhishek B";
       System.out.println("Original String : " + str);
       int ctr = str.codePointCount(1, 10);
           
       System.out.println("Codepoint count = " + ctr);
     }
   }
   