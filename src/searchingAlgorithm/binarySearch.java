package searchingAlgorithm;

import java.util.Arrays;

public class binarySearch {

	public int searchElement(int low, int high, int a[], int findNo) {
		int medium = (low + high) / 2;
		if (findNo == a[medium])
			return medium;
		else if (low == high) {
			if (findNo == a[low])
				return low;
			else
				return -1;
		} else if (findNo < a[medium]) {
			return searchElement(low, medium - 1, a, findNo);
		} else if (findNo > a[medium])

		{
			return searchElement(medium + 1, high, a, findNo);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 98, 82, 71, 64, 15, 74, 30, 22, 81, 10 };
		Arrays.sort(a);
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();
		binarySearch bs = new binarySearch();
		int index = bs.searchElement(0, a.length - 1, a, 74);
		if (index == -1) {
			System.out.println("Element not found " + index);
		} else {
			System.out.println("Element found at location " + index);
		}
		
		System.out.println("Java Implementation of binary search "+Arrays.binarySearch(a, 74));
	}

}
