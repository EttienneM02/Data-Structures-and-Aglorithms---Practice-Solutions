
public class SelectionSorter {

	int size = 650;
	int[] array = new int[size];//{1,3,4,10,2,5,7,8,99,11,10,18,190,18,45,122,23,121,1222,123,10000,110};

	public SelectionSorter() {
		for(int i = 0; i < size;i++) {
			array[i] = (int)((Math.random()) * 100);
		}

	}
	//private int[] array = {1,2,100,-1,-2,-100,-34,111,0,0,0,0,0,333,44234,55,1,33,4,223,4,11,100,1999,20,12,0};
	
	public int[] selectionSorter() {
		
		//we need to sort by ascending order
		//begin by assuming the first value is the min
		int minIndex = 0;
		int temp = 0;
		int count = 0;
		for(int i = 0; i < array.length - 1;i++) {
		minIndex = i;
			for(int j = i+1;j < array.length;j++) {
				//comparison
				if(array[minIndex] > array[j]) {
					//update the min index
					minIndex = j;
			
				}
				count++;
			}
			//swap
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			
		}
		
		//return the sorted list
		System.out.println("Number of iterations: " + count);
		System.out.println();
		return this.array;
		
	}
	
	
	public void outputSequence() {
		int[] arraySorted = this.selectionSorter();
		for(int i = 0 ; i < array.length; i++) {
			System.out.println("Sorted list: " + arraySorted[i] );
		}
		
	}
	
	public static void main(String[] args) {
		
		SelectionSorter Ssorter = new SelectionSorter();
		
		Ssorter.outputSequence();
		

	}

}
