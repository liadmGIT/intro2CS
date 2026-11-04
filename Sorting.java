public class Sorting {

	public static void  main(String[] args){
		int[] array = {3,5,0,200,-4,0};
		sort(array);
		printArray(array);
	}

	public static void sort(int[] array){
		// write your code here
        int from = 0;
	while (from < array.length-1) {

    int curMin = minIndex(array, from);
    swap(array, from, curMin);
    from = from +1;
    }
    } 

	// Assumes a!=null & from<a.length
	public static int minIndex(int[] array, int from) {
		int minIndex = from;
		for(int i = from+1; i<array.length; i=i+1) 
			if (array[i] < array[minIndex]) 
				minIndex = i;  
		return minIndex;
	}

	//swap element a[i] with a[j]
	public static void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	//----------------------------------------------------------
	public static void printArray(int[] array){
		if (array == null)
			System.out.print(array);
		else{
			System.out.print("{ ");
			for(int element: array)
				System.out.print(element+" ");
			System.out.println("}");
		}
	}
}