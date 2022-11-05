package Day28;

public class pattern3 {
 
    //using do-while loops
	public static void main(String[] args)
	{
		int number = 7;

		int i = number, j;
		do {
			j = 0;
			do {
				System.out.print(" ");
			} while (j++ < number - i);
			j = 0;
			do {
				System.out.print("*");
			}
			while (j++ < i * 2 - 2);
			System.out.println("");
		}
		while (--i > 0);
	}
}

