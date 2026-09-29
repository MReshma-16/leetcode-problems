class Solution {
    public String removeStars(String s) {
        Stack<Character>stack=new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='*'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
             
    StringBuilder res=new StringBuilder();
    while(!stack.isEmpty()){
        res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}