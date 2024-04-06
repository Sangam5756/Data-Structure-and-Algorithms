class Solution {
    public String minRemoveToMakeValid(String ss) {
        
        Stack<Integer> s  = new Stack<>();
        StringBuilder str = new StringBuilder(ss);
        for(int i=0; i<ss.length(); i++){

            if(str.charAt(i) == '('){
                s.push(i);
            
            }else if(str.charAt(i) == ')'){
                if(!s.isEmpty()  && str.charAt(s.peek()) == '('){
                    s.pop();
                }else{
                    str.setCharAt(i, '*');
                }
            }
        }

        while(!s.isEmpty()){
            str.setCharAt(s.pop(),'*');
        }

         StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '*') {
                result.append(str.charAt(i));
            }
        }

        return result.toString();


    }
}
