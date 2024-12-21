// Print all the duplicate characters in a string
import java.util.*;

class Main {
    void findDuplicate(String s){
        Set<Character> set = new HashSet<>();
        ArrayList<Character> arr = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            // char ch = Character.toLowerCase(s.charAt(i));
            if(set.contains(ch)){
                arr.add(ch);
            }
            else{
                set.add(ch);
            }
        }
        for(char ch : arr){
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        String s = "Atharva";
        Main obj = new Main();
        obj.findDuplicate(s);
    }
}
