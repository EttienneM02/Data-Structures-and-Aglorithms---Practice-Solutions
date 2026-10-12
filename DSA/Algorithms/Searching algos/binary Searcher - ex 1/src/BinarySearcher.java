
public class BinarySearcher {


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
    public static void main(String[] args){
        int[] array = {-3,1,2,3,5,6,8,19,102,107,210,430,435,567,677,1000};

        int targetValue = -100;

        BinarySearcher binSearcher = new BinarySearcher();

        int Targetindex = binSearcher.search(array,targetValue);


        if(Targetindex >= 0){
                    System.out.println("Value found at position: " + Targetindex);

        }else{
                 System.out.println("target not found");

        }

    }
    

}
