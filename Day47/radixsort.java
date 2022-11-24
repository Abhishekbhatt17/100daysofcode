package Day47;


import java.util.Arrays;

public class radixsort {
  
  public int getMax(int A[])
  {
      int max = A[0];
      for (int i = 1; i < A.length; i++){
          if (A[i] > max)
              max = A[i];
      }
      return max;
  }
  public void radixSort(int A[])
  {
      int digitPlace = 1;
      int n=A.length;
      int result[]=new int[n];
      int largestNum = getMax(A);
      while(largestNum/digitPlace >0){
        
          int count[]=new int[10];
        for (int i=0; i <10; i++)
            count[i] = 0;
          for (int i = 0; i < n; i++)
              count[ (A[i]/digitPlace)%10 ]++;
          for (int i = 1; i < 10; i++)
              count[i] += count[i - 1];
          for (int i = n - 1; i >= 0; i--)
          {
              result[count[ (A[i]/digitPlace)%10 ] - 1] = A[i];
              count[ (A[i]/digitPlace)%10 ]--;
          }
          for (int i = 0; i < n; i++)
              A[i] = result[i];
              digitPlace *= 10;
      }
  }
  public static void main(String arg[]){
    
    int a[] = {432, 8, 530, 90, 88, 231, 11, 45, 677, 199};
      System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(a)); 
    
    radixsort rs= new radixsort();
      rs.radixSort(a);
  
      System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(a)); 
      
  }
}

