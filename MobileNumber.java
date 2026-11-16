
public class MobileNumber {
	
	
	// Assumes permutation!=null & directions!=null & 0<permutation.length==directions.length & 0<=index<permutation.length
	public static boolean isMobile(int[] permutation, int[] directions, int index) {
		boolean ans = false;

		//------Your code goes here-----
		if (index + 1 != permutation.length && directions[index] == 1 && permutation[index] >= permutation[index+1]){
			ans = true;
		}
		else if (index - 1 != -1 && directions[index] == -1 && permutation[index] >= permutation[index-1]){
			ans = true;
		}
		return ans;		
	}
	
	
	
	// Assumes permutation!=null & directions!=null & 0<permutation.length==directions.length
	public static int findMobileIndex(int[] permutation, int[] directions) {
		int maxMobileIndex = -1;

		//------Your code goes here-----
		for (int index = 0; index<= permutation.length - 1; index = index + 1){
		if (isMobile(permutation, directions, index) == true && (maxMobileIndex ==-1 || permutation[index] >= permutation[maxMobileIndex])){
		maxMobileIndex = index;
		}
		}
		return maxMobileIndex;			
	}
	
	public static void main(String[] args) {
		int[] permutation1 = {0,1,3,2};
		int[] directions1 = {-1,1,-1,1};
		int[] permutation2 = {0,2,1,3};
		int[] directions2 = {-1,-1,1,1};
		int[] permutation3 = {1,0,2};
		int[] directions3 = {-1,-1,1};
		
		/*
		 * You can check your code here.
		 * For Example:*/
		 //		System.out.println(isMobile(permutation1, directions1, 1));	// false
		 // 		System.out.println(isMobile(permutation1, directions1, 2));	// true
		  //		System.out.println(isMobile(permutation3, directions3, 1));	// false
		 
		 	System.out.println(findMobileIndex(permutation1, directions1));	// 2
		 	System.out.println(findMobileIndex(permutation2, directions2));	// 1
		 	System.out.println(findMobileIndex(permutation3, directions3));	// -1
		
	}
}
