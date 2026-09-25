class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>s1=new Stack<>();
        for(char ch :s.toCharArray()){
           if(s1.isEmpty()){
           s1.push(ch);
           }
           else if(ch==s1.peek()){
            s1.pop();
           }
           else{
            s1.push(ch);
           }
        }
    String result = "";

for (char ch : s1) {
    result = result + ch;
}
return result;
    }
    }
