package searchingAlgorithm;

import java.util.Arrays;

public class linearSearch {
	public int search(int[] arr,int findNo) {
		int index=-1;
		for(int i=0;i<arr.length;i++)
			if(arr[i] == findNo) {
				index=i;
				break;
			}
			else
				continue;
		return index;
	}
	
	public static void main(String[] args) {
		
		linearSearch s=new linearSearch();
		int a[]= new int[] {10,20,30,40,50,70,60,90};
		int index=s.search(a,100);
		
		if(index ==-1)
			System.out.println("Element not found");
		else
			System.out.println("Elemnet found at location "+index);
		
		// sysout java has no implementation of linear search
		
	}

}
