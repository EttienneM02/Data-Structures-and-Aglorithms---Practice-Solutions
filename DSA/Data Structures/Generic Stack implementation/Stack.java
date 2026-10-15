// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;


class Stack <T>{

    private List<T> list;
    private int min;
    private int max;
    
    public Stack(){
        list = new ArrayList<>();
        min = 0;
        max = 0;
    }
    //add to the stack
    public void push(T node){
        this.max++;//increnent the size of the array list
        this.list.add(node);//adds the node 
    }


    public T pop(){
        //get the last element of the array
        if(!isEmpty()){
            
        T node = this.list.get(this.max - 1);
            this.list.remove(this.max - 1);
        //decrement the max
            this.max--;
            return node;
        }
        return null;
        
    }

    public void printAll(){
        if(!isEmpty()){
            //for(T i : this.list)
                System.out.println("Words: " + this.list.toString());
        }
    }

    public boolean isEmpty(){
        if(this.list.size() == 0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        Stack<String> s = new Stack<>();
        s.push("Time");
        s.push("is");
        s.push("currency!");
        s.push("deddie");
        //remove a word
        String word = s.pop();
        s.push("french");
        System.out.println("Word removed: " + word);
        //return the list to test
        s.printAll();
        s.printAll();
    }
}
