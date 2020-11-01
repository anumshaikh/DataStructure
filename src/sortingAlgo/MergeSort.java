package sortingAlgo;

public class MergeSort {
	  static void merge(int arr[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  

	public static void mergesort(int arr[], int l, int r) {
		if (l < r)

		{
			int mid = (l + r) / 2;
			mergesort(arr, l, mid);
			mergesort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 10, 4, 2, 67, 19, 1, 50, 44, 27, 40 };
		System.out.println("Before Sorting ");
		for (int a : arr) {
			System.out.print(" " + a);
		}
		System.out.println("\nCalling sorting function");
		mergesort(arr, 0, arr.length-1);
		System.out.println("After sorting");
		for (int a : arr) {
			System.out.print(" " + a);
		}

	}

}
