class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s=new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                s.pop();
            }
            else if(op.equals("D")){
                int top=s.peek();
                s.push(top*2);
            }
            else if(op.equals("+")){
                int first=s.pop();
                int sec=s.peek();
                s.push(first);
                s.push(first+sec);
            }
            else {
                s.push(Integer.parseInt(op));
                }
            }
            int sum=0;
            for(int s1:s){
                sum+=s1;
            }
            return sum;
        }
    }
