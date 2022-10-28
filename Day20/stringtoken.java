package Day20;


import java.util.*;

public class stringtoken{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()){
                System.out.println(0);
            }else {
                 String input=sc.nextLine();
                String[]a = input.trim().split("[ !,?._'@]+");
                ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
                System.out.println(listOfStrings.size());
     
              for(String str:listOfStrings){
                System.out.println(str);
              }    
            }
        }
        
        
        
    }
}
