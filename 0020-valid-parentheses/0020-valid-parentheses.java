class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        char[] sarr = s.toCharArray();
        for(char c : sarr){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if((c == ')' && top!='(') || 
                    (c == '}' && top!='{') ||
                    (c == ']' && top!='[')){
                        return false;
                    }
            }

        }

        return stack.isEmpty();
    }
}