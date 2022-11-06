package Day29;

public class mergearray {
	public static void main(String[] args)
	{
		int a[] = { 1,2,3};
		int b[] = { 4,5,6,7 };

		int a1 = a.length;
		int b1 = b.length;
        
		int c1 = a1 + b1;

		int[] c = new int[c1];
		for (int i = 0; i < a1; i = i + 1) {

			c[i] = a[i];
		}
		for (int i = 0; i < b1; i = i + 1) {
			c[a1 + i] = b[i];
		}
		for (int i = 0; i < c1; i = i + 1) {
			System.out.println(c[i]);
		}
	}
}
