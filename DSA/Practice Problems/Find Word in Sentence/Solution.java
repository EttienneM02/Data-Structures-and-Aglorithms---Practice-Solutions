// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
      String text = "i love apples, apples are apples, apples t-rex";
          String target = "apples";
        //count the number of substrings that match the target
        //constant window -> matches the length of the target word
        List<Integer> indexList = new ArrayList<>();
        int left = 0;
        int right = target.length();

        while(right <= text.length()){
               System.out.println(text.substring(left,right));
                if(target.equals(text.substring(left,right))){
                indexList.add(left);//add the starting index
                }
            left++;//move the left and right pointer
            right++;
        }
        
      
        for(Integer i : indexList){
                System.out.println("index values:" + i);
            }
            
        
        
    }
}
