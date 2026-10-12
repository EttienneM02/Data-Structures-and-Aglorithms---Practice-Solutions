
public class BinarySearcher {
	//simple binary searcher 

			
		public int search(int[] array,int target,int size){
			//define a low, mid and high
			int low = 0;
			int high = size;
			//iterate while the low <= high
			while(low <= high){
				//calculate a midpoint
				int mid = (low + high)/2;
				//validate if the current position's value is equal to our target value
				if(array[mid] == target){
					//return the target
					return mid;
				}
				//if the position value is less than the target value
				if(array[mid] < target){
					//shift to the right -> target value is greater than mid point value
					low = mid + 1;
				}else if(array[mid] > target) {
					high = mid - 1;
				}
				//else if the position value is not equal or less than the target value
				//shift the search range to the left
			
			}
			//if the target index was not found
			return -1;
		}	
			
		
			public static void main(String[] args){
				BinarySearcher searcher = new BinarySearcher();
				//integer sorted array
				int[] sortedlist = {1,1,2,33,45,89,345,367,452,566,4343,5454,21212,112111,400983,1000090};
				int target = -90;//not in the list
				int size = sortedlist.length - 1;
				int targetIndex = searcher.search(sortedlist,target,size);
				
				System.out.println("target index of " + target + " is " + targetIndex);
				
			
			}
			

	}


