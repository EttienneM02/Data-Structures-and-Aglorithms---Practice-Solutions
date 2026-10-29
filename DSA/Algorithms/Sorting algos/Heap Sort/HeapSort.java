// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class MinHeap{
    private int[] arry;
    private int size;

    public MinHeap(int[] arry){
        this.arry = arry;
        this.size = this.arry.length;
        //build the heap
        this.buildHeap();
    }

    public void buildHeap(){
        //manipulates the array
        //iterate from the last known root index
        //heapify the array
        for(int i = this.size / 2 - 1; i >= 0;i--){
            //heapify each element from the last known root
            this.heapify(i);
        }

        
    }

    public void heapify(int rootIndex){
        //get the right and left child index from current root
        int leftChildIndex = rootIndex * 2 + 1;
        int rightChildIndex = rootIndex * 2 + 2;
        int minIndex = rootIndex; 
        //check if the children indexes are valid -> do they exist within the tree?
        if(leftChildIndex < this.size){
            //Node does exist -> compare with current parent
            if(this.arry[leftChildIndex] < this.arry[minIndex]){
            minIndex = leftChildIndex;
            
            }
            }
        if(rightChildIndex < this.size){
            if(this.arry[rightChildIndex] < this.arry[minIndex]){
                 minIndex = rightChildIndex;
       
            }
    }

        //swap
        this.swap(this.arry,rootIndex,minIndex);
        //check if the root index was 
        //initially the rootindex was assigned as the initial max, therefore, we need to continue adjusting the tree untill fully sorted as min heap
        if(rootIndex != minIndex){
            heapify(minIndex);
        }
        
    }

    public int getSize(){
        return this.size;
    }

    public int getRoot(){
        //get the root element -> then adjust the vertices
        int min = this.arry[0];//get the first element of the heap(root)
        //add the last element to the root 
        this.arry[0] = this.arry[size - 1];
        size--;//the size of the heap will decrease, we removed the root
        //heapify to adjust the elements
        this.heapify(0);
        return min;
    }

    public void display(){
        for(int i = 0; i < this.size;i++ )
            {
                System.out.print(this.arry[i] + " ");
            }
    }

    public void swap(int[] arry,int a,int b){
        int temp = arry[a];
        arry[a] = arry[b];
        arry[b] = temp;
    }
}

class Main {
    public static void main(String[] args) {
       int[] arry = {1,3,4,22,5,3,66,3,12,5,7,5,3,5,7,9,0,76,8,34};

        MinHeap mHeap = new MinHeap(arry);

        System.out.println(mHeap.getRoot());
        System.out.println(""); 
        mHeap.display();
        
       
        
    }
}
