import java.util.*;

class HelloWorld {
    static void charCount(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        String SortedStr = new String(charArray);
        
        for(int i = 0; i < charArray.length; i++){
            int count  = 1;
            while(i < charArray.length-1 && SortedStr.charAt(i) == SortedStr.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                System.out.println(SortedStr.charAt(i) + ", Count : " + count);
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "Hello";
        charCount(str);
    }
}