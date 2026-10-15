
import java.util.Set;
import java.util.HashSet;

class Main {
//this is a hashset -> it hashes a value's reference in memory
    // this means that, it's different from a list or array 
    //values are not stored sequentially
    //NB: duplicate elements can not be stored in the same set
    //it is an unordered collection with no duplicates
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        Set<Integer> Hashset = new HashSet<>();
        Hashset.add(2);
        Hashset.add(4);
        Hashset.add(3);
        Hashset.add(6);
        Hashset.add(2);
        
        for(int i : Hashset){
            System.out.println("Element : " + i);
        }
    }
}
