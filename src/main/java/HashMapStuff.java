import java.util.Map;
import java.util.HashMap;

public class HashMapStuff {

    //How to keep track of a character's occurance in a hashmap
    public static void populateHashMap(String s){

       Map<Character, Integer> charOccurances = new HashMap<>();
       //convert string to char array and loop through it to populate hashmap
       for(char c: s.toCharArray()){
           charOccurances.put(c, charOccurances.getOrDefault(c,0) + 1);
       }
   System.out.print(charOccurances);
   }

   //How to keep track of a character in a string, where it was last seen

    public static void trackCharacters(String s){
        Map<Character, Integer> charIndices = new HashMap<>();

        char[] charArray = s.toCharArray();
       for(int i = 0; i < charArray.length; i++){
         charIndices.put(charArray[i], i);

       }
       System.out.print(charIndices);
    }
   public static void main(String[] args){
       String inputString = "jldkfdklfdii";
       populateHashMap(inputString);
       trackCharacters(inputString);
   }

}
