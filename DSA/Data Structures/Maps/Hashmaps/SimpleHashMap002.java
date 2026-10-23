// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


class Main {
    public static void main(String[] args) {
       Map<Integer,String> map = new HashMap<>();

        map.put(1,"Andrew");
        map.put(2,"Will");
        System.out.println(map);

        Set<Integer> keys = new HashSet<>();
            
            keys = map.keySet();

        System.out.println("Key set: " + keys.toString());
    }
}
