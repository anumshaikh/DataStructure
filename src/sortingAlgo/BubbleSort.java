package sortingAlgo;

public class BubbleSort {
	static void recursive(int arr[], int n) {
		if (n == 1)
			return;
		for (int j = 0; j < n - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		System.out.print("\n iteration " + n+" : ");
		for (int a : arr) {
			System.out.print(" " + a);
		}

		recursive(arr, n - 1);

	}

	static void bubble(int arr[], int n) {
		int temp;
		boolean swap = false;

		for (int i = 0; i < n; i++) {
			swap = false;
			System.out.print("iteration i " + i + "\t");
			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					swap = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				// System.err.println(" arr[i] " + arr[i] + " arr[j] " + arr[j]);

			}
			if (swap == false) {
				break;
			}
			for (int a : arr) {
				System.out.print(" " + a);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int arr[] = { 67, 50, 44, 40, 27, 19, 10, 4, 2, 1 };
		System.out.println("Original Array ");
		for (int a : arr) {
			System.out.print(" " + a);
		}
		System.out.println();
		// arr = bubble(arr, arr.length);
		recursive(arr, arr.length);
		System.out.println("\n Output Array");
		for (int a : arr) {
			System.out.print(" " + a);
		}
	}

}
