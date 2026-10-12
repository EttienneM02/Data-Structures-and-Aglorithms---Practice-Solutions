
public class BubbleSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 650;
		int[] array = new int[size];//{1,3,4,10,2,5,7,8,99,11,10,18,190,18,45,122,23,121,1222,123,10000,110};
		for(int i = 0; i < size;i++) {
			array[i] = (int)((Math.random()) * 100);
		}
		
		int temp = 0;
		int counter = 0;
		//sorting -> if (x2 < x1) -> swap 
		for(int i = 0; i < array.length;i++) {
			//iterate through the list of elements
			for(int j = 0; j < array.length -1;j++) {
				//swap condition
				if(array[j] > array[j+1]) {
					//swap
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					
				}
				counter++;//keep track of the number of iterations
				
			}
		}
		
		for(int x = 0; x < array.length;x++) {
			System.out.print(array[x] + "\s");
		}
		System.out.println(" ");
		System.out.println("Total Iterations: " + counter);
		

	}

}
