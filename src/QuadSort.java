
public class QuadSort {
	public static void main(String[] args) {
		int[] i = selectionSort(new int[] {6, 5, 8, 4, 7, 98, 10, 9, 1000, 14, 498, 485, 93, 3, 2, 1});
		for(int p : i) {
			System.out.print(p + ", ");
		}
	}
	public static int[] bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = 0; j < arr.length -1; j++) {
				if(arr[j] > arr[j+1]) {
					int k = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = k;
				}
			}
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int l = arr[i];
			int lindex = i;
			for(int j = i; j < arr.length; j++) {
				if(l > arr[j]) {
					l = arr[j];
					lindex = j;
					//System.out.print(i);
					//System.out.print(j);
					//System.out.print(l);
					//System.out.print(lindex + "\n");
				}
			}
			int temp = arr[i];
			arr[i] = l;
			arr[lindex] = temp;
			
		}
		return arr;
	}
	
	public static int[] insertionSort(int[] arr) {
		return arr;
	}
	public static int[] mergeSort(int[] arr) {
		return arr;
	}
	
}
