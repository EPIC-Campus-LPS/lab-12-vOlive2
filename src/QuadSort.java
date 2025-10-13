
public class QuadSort {
	public static void main(String[] args) {
		int set = 1000000;
		int[] i = new int[set];
		for(int p = 0; p < i.length; p++) {i[p] = (int)(Math.random()*set);}
		System.out.print(""+(System.currentTimeMillis()));
		
		i = insertionSort(i);
		System.out.print("-"+(System.currentTimeMillis()));

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
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		return arr;
	}
	public static int[] mergeSort(int[] arr) {
		if(arr.length == 1) {return arr;}
		int[] arr2 = new int[(int)(((arr.length)/2.0)+0.5)];
		
		int[] arr3 = new int[(int)(((arr.length)/2))];

		//System.out.println("len2 :"+arr2.length);
		//System.out.println("len3 :"+arr3.length);
		for(int i = 0; i < arr2.length; i++) {arr2[i] = arr[i];}
		for(int i = 0; i < arr3.length; i++) {arr3[i] = arr[i+arr2.length];}
		
		arr2 = mergeSort(arr2);
		arr3 = mergeSort(arr3);
		int[] arr4 = new int[arr2.length+arr3.length];
		int a = 0; // for arr 2
		int b = 0; // for arr 3
		int i = 0; // for arr 4
		while (a < arr2.length && b < arr3.length) {
			if (arr2[a] <= arr3[b]) {
				arr4[i] = arr2[a];
				a++;
			} else {
				arr4[i] = arr3[b];
				b++;
			}
			i++;
		}
		while (a < arr2.length) {
			arr4[i] = arr2[a];
			i++;
			a++;
		}
		while (b < arr3.length) {
			arr4[i] = arr3[b];
			i++;
			b++;
		}
		return (arr4);	
	}
}
