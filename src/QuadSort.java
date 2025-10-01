
public class QuadSort {
	public static void main(String[] args) {
		int[] i = selectionSort(new int[] {6, 5, 4, 3, 2, 1});
		System.out.print("" + i[0] + i[1] + i[2] + i[3] + i[4] + i[5]);
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
			int lindex = arr.length-1;
			for(int j = i; j < arr.length; j++) {
				if(l > arr[j]) {
					l = arr[j];
					lindex = j;
					System.out.print(i);
					System.out.print(j);
					System.out.print(l);
					System.out.print(lindex + "\n");
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
