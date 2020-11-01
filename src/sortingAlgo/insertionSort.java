package sortingAlgo;

public class insertionSort {

	public static void recursive(int arr[], int n) {
		if (n <= 1)
			return;
		recursive(arr, n - 1);
		System.out.print("iteration n " + n + "\t");
		for (int j = n -1; j > 0; j--) {
			if (arr[j] < arr[j - 1]) {
				int temp = arr[j];
				arr[j ]= arr[j-1];
				arr[j-1] = temp;
			}
		}
		for (int a : arr) {
			System.out.print(" " + a);
		}
		System.out.println();
	}

	public static int[] insertionsort(int arr[], int n) {

		for (int i = 0; i < n - 1; i++) {

			System.out.print("iteration i " + i + "\t");
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}

			for (int a : arr) {
				System.out.print(" " + a);
			}
			System.out.println();
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 4, 2, 67, 19, 1, 50, 44, 27, 40 };
		System.out.println("Original Array ");
		for (int a : arr) {
			System.out.print(" " + a);
		}
		System.out.println();
		recursive(arr, arr.length);
		System.out.println("\n Sorted Array ");
		for (int a : arr) {
			System.out.print(" " + a);
		}

	}

}
