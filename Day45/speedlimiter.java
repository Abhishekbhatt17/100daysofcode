package Day45;
import java.util.Scanner;
public class speedlimiter {
    public static void main(String[] args) {
        int speed=0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the speed: ");
            speed=in.nextInt();
        }
        if(speed<70)
        {
            System.out.println("Ok");
        }
        else
        {
            int p=(speed-70)/5;
            int points=0;
            for(int i=0;i<p;i++)
            {
                points=points+1;
            }
            if(points>12)
            {
                System.out.println("License suspended");
            }
            else {
                System.out.println("Points: "+points);
            }
        }
    }

}