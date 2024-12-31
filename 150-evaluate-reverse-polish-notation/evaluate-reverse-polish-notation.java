class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens){
            int first;
            int last;
            if(s.equals("+")){
                last = stack.pop();
                first = stack.pop();
                stack.push(first + last);
            }else if(s.equals("-")){
                last = stack.pop();
                first = stack.pop();
                stack.push(first - last);
            }else if(s.equals("*")){
                last = stack.pop();
                first = stack.pop();
                stack.push(first * last);
            }else if(s.equals("/")){
                last = stack.pop();
                first = stack.pop();
                stack.push(first / last);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}