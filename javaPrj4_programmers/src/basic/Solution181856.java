package basic;

public class Solution181856 {
	
	public int solution(int[] arr1, int[] arr2) {
		int answer = 0;
		
		if(arr1.length > arr2.length) {
			answer = 1;
		} else if(arr1.length < arr2.length) {
			answer = -1;
		} else if(arr1.length == arr2.length){
			answer = 0;
		} else {
			for(int i : arr1) {
				int sum1 += arr1[i];
			}
		}
		
		return answer;
	}
	
}
