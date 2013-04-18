package alg;

import java.util.Arrays;

public class BinSort {

	public static void main(String[] args){
		int[] arr = {67,7,9,9,10,11,5,13,14,14,7,7,4,9,7,9,7,7,1};
		System.out.println(Arrays.toString(arr));
		for( int i = 0; i < arr.length; i++){
			int start,end,mid;
			start = 0;
			end = i-1;
			mid = 0;
			int temp = arr[i];
			while(start <= end){
				mid = (start + end) / 2;
				if (arr[mid] > temp){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
				System.out.println("while");
			}
			System.out.println("" +start + "," + mid + "," + end);
			for( int j = i-1; j > end; j--){
				arr[j+1] = arr[j];
			}
			arr[end + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
