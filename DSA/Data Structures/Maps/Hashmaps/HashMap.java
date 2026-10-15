import java.util.*;

public class HashTable{

    //define the hashtable
    
    public static void main(String[] args){
    Hashtable<Integer,String> table = new Hashtable<>();//when declared it has an initial capacity of 11 -> dynamically expands when 75% of the table id filled up
            
    table.put(200,"Sam");
    table.put(210,"Queterm");
    table.put(230,"Tabby");
    System.out.println("The Name found is: " + table.get(200));
        
    System.out.println("The Name found is: " + table.get(210));
        
    System.out.println("The Name found is: " + table.get(230));
    table.remove(210);//the value of key 210 -> "Queterm" will be removed
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() + "\s" + key + "\s" + " Value " + table.get(key));
        }
    }
    
}
    
