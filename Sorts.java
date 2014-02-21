import java.util.*;

public class sorting {
	/* Ver Starr */

	/* bubble sort */
	public static int[] bubble(int[] data) {
		int tmp = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[j] > data[j + 1]) {
					tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}
		return data;
	}

	/* insertion sort */
	public static int[] insertion(int[] data) {
		for (int i = 0; i < data.length; i++) {
   			int j = i;
   			while (j > 0 && data[i] < data[j - 1])
      			j--;
   			int tmp = data[i];
   			for (int k = i; k > j; k--)
      			data[k] = data[k - 1];
   			data[j] = tmp;
		}
		return data;
	}

	/* merge sort */
	public static int[] merge(int[] data) {
   		if (data.length == 1)
      		return data;
   		int middle = data.length / 2;
   		int[] left = merge(subArray(data, 0, middle - 1));
   		int[] right = merge(subArray(data, middle, data.length - 1));
   		int[] result = new int[data.length];
   		int dPtr = 0;
   		int lPtr = 0;
   		int rPtr = 0;
   		while (dPtr < data.length) {
      		if (lPtr == left.length) {
         		result[dPtr] = right[rPtr];
         		rPtr++;         
      		} 
      		else if (rPtr == right.length) {
         		result[dPtr] = left[lPtr];
         		lPtr++;
      		} 
      		else if (left[lPtr] < right[rPtr]) {
         		result[dPtr] = left[lPtr];
         		lPtr++;
      		} 
      		else {
         		result[dPtr] = right[rPtr];
         		rPtr++;         
      		}
      		dPtr++;
   		}
   		return result;
	}

	public static int[] subArray(int[] data, int start, int end) {
    int size = end - start + 1;
		int[] result = new int[size];
    int count = 0;
		for (int i = start; i <= end; i++) {
			result[count] = data[i];
      count++;
		}
		return result;
	}

  /* Merge two arrays */
  public static int[] merge2arrays(int[] a, int[] b) {
      int len = a.length + b.length;
      int[] merged = new int[len];
      int i = 0, j = 0, k = 0;

      while (i < a.length && j < b.length) {
          if (a[i] < b[j])       
              merged[k++] = a[i++];
          else        
              merged[k++] = b[j++];               
      }

      while (i < a.length)  
          merged[k++] = a[i++];


      while (j < b.length)    
          merged[k++] = b[j++];

      return merged;
  }

	public static void printArray(String sortType, int[] data) {
		  System.out.println(sortType);
		  for (int i = 0; i < data.length; i++) {
        	System.out.print(data[i] + " ");
      }
      System.out.println();
	}


  public static void print(int str) {
      System.out.println(str);
  }

  public static void main(String[] args) {
      int[] data1 = {5, 2, 4, 1, 3};
      printArray("Before: ", data1);
      printArray("Bubble: ", bubble(data1));

      int[] data2 = {5, 2, 4, 1, 3};
      printArray("Before: ", data2);
      printArray("Insertion: ", insertion(data2));

      int[] data3 = {5, 2, 4, 1, 3};
      printArray("Before: ", data3);
      printArray("Merge: ", merge(data3));   

      int[] data4 = {5, 2, 4, 1, 3};
      printArray("Before: ", data4);
      Arrays.sort(data4);
      printArray("Quick: ", data4);      


      int[] listA = {6, 3, 4, 7, 9, 1, 5, 2, 8, 0};
      int[] listB = {3, 5, 4, 1, 0, 9, 7, 8, 2, 6};

      printArray("Before: ", listA);
      printArray("Before: ", listB);

      printArray("Merge2Arrays: ", merge2arrays(merge(listA), merge(listB)));
  }

}
