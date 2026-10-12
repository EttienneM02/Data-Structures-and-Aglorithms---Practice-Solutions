

public class Main {
    
    public static void main(String[] args){
        int[] array = {-3,1,2,3,5,6,8,19,102,107,210,430,435,567,677,1000};

        int targetValue = 19;

        BinarySearcher binSearcher = new BinarySearcher();

        int Targetindex = binSearcher.search(array,targetValue);


        if(Targetindex >= 0){
                    System.out.println("Value found at position: " + Targetindex);

        }else{
                 System.out.println("target not found");

        }

    }
    
}
