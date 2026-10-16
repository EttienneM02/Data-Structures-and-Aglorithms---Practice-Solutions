// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.List;
import java.util.ArrayList;

class MergeTwoSortedLists {


    public List<Integer> mergeSort(int[] arryA, int[] arryB, int m, int n){
        List<Integer> sortedlist = new ArrayList<>();//will store all the elements of a sorted list -> after sorting

        int i= 0,j = 0,k = 0;//keep track of the current position within a list of elements
        while(i <= m && j <= n){//prevent the index pointers from going out of bounds of the array size of both lists
            if(arryA[i] > arryB[j]){
                //get the value of the array -> where the first list equals to j
                sortedlist.add(arryB[j]);
                k++;
                j++;
 
            }else{//if the value of the second list is smaller, add to the new list
                sortedlist.add(arryA[i]);
                k++; 
                i++;
            }
        }
        //add the remainder of the first list to the new array -> if there is still more elements to add
        for(int x = i; x < m;i++){
            sortedlist.add(arryA[x]);
        }
        //add the numbers to the second list -> remainders have been detected    
        for(int y = j; y < n;y++){
            sortedlist.add(arryB[y]);
        }
    return sortedlist;
        
    }

    public void displayList(List<Integer> list){
        for(int i = 0; i < list.size();i++){
        System.out.println("List:" + list.toString());
        
        }
        }
    
    public static void main(String[] args) {//the lists must be sorted
        int[] arrayA = {1,2,3,4,12,21,23,121,924,1002,6610};
        int[] arrayB = {2,32,44,51,211,551,611,3344,7897,9109};
        int a = arrayA.length - 1;
        int b = arrayB.length - 1;

        MergeSorter s = new MergeSorter();
        
         List<Integer> sortedArray = s.mergeSort(arrayA,arrayB,a,b);
                //merge both arrays into a single sorted list
        s.displayList(sortedArray);
    }
}
