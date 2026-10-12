

public class BinarySearcher{
    

public int search(int[] list, int targetvalue){


  
    int low = 0;
    int high = list.length - 1;
    //check if our low <= high -> continue searching
    while(low <= high){
        //get the midpoint of the array
        int mid = (low + high)/2;
        if(list[mid] == targetvalue){
            return mid;
        }
        if(list[mid] > targetvalue){
            //shift to the the left
            high = mid - 1;
        }else{
            //shift to the right
            low = mid + 1;
        }

    }
    return -1;//taget not found
}



}