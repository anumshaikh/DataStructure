package sortingAlgo;

public class SelectionSort {

	/*public static void recursive(int arr[], int n) {
		if (n ==1)
			return;
		recursive(arr, n - 1);
		System.out.print("iteration n " + n + "\t");
		int min = arr[0];
		int index = -1;
		for (int j = 0; j < n; j++) {
			if (arr[j] < min) {
				min = arr[j];
				index = j;
			}
		}
		System.err.println("\nmin "+min+ " index "+index);
		if (index != -1) {

			int temp = arr[n];
			arr[0] = arr[index];
			arr[index] = temp;

		}
		System.out.println();
		for (int a : arr) {
			System.out.print("  " + a);
		}
		System.out.println();

	}*/

	public static void selectionSort(int arr[], int n) {
		int min, index, temp;
		for (int i = 0; i < n; i++) {
			min = arr[i];
			index = -1;
			System.out.print("iteration i " + i + "\t");
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}

			}
			if (index != -1) {
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = min;
			}
			for (int a : arr) {
				System.out.print(" " + a);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 10, 4, 2, 67, 19, 1, 50, 44, 27, 40 };
		System.out.println("Original Array ");
		for (int a : arr) {
			System.out.print(" " + a);
		}
		System.out.println();
		selectionSort(arr, arr.length);
		System.out.println("\n Sorted Array ");
		for (int a : arr) {
			System.out.print(" " + a);
		}

	}

}
