// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class HeapSort {
    //integer array
    private int[] array;
    private int size;

    public HeapSort(int[] array){
        this.array = array;
        this.size = array.length;
        System.out.println("Sorter ready!");
        this.createHeap();
    }

    public void createHeap(){
        //iterate from the last known child node till the root
        for(int i = (this.size - 1) / 2; i >= 0;i--){
            //heapify the elements
            this.heapify(i);
        }
    }

    public void heapify(int root_index){
        //get the left and right side 
        int max_index = root_index;
        int leftchild = 2 * root_index + 1;
        int rightchild = 2 * root_index + 2;
        //compare all the elements to find out the maximum of the elements
        if(leftchild < this.size){//avoid out of bounds error
            if(this.array[leftchild] > max_index){
                max_index = leftchild;
            }
        }

        if(rightchild < this.size){
            if(this.array[rightchild] > max_index){
                max_index = rightchild;
            }
        }
        //swap 
        this.swap(this.array,max_index,root_index);
        //check if the rooot index was changed
        if(root_index != max_index){
            this.heapify(max_index);
        }
        
        
    }

    public void getHeap(){
        for(int i = 0; i < this.size; i++){
            System.out.println("Heap:"
                              + this.array[i]);
        }
        
    }

    public int extractRoot(){
        int max_root = this.array[0];
        array[0] = array[this.size--];
        this.heapify(0);
        return max_root;
    }

    public void swap(int[] array,int max,int root){
        int temp = array[root];
        array[root] = array[max];
        array[max] = temp;
            
    }
    
    
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        int[] array = {0,1,45,33,46,67,44,32,12,78};
        HeapSort s = new HeapSort(array);
        s.getHeap();
    }
}
