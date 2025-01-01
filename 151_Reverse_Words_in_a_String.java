class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String temp = "", ans = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(temp.length() > 0){
                    stack.push(temp);
                    temp = "";
                }
            }
            else{
                temp = temp + s.charAt(i);
            }
        }

        ans = ans + temp;

        while(!stack.isEmpty()){
            ans = ans + " " + stack.pop();
        }

        if(ans.length() != 0 && ans.charAt(0) == ' '){
            ans = ans.substring(1);
        }
        return ans;
    }
}
