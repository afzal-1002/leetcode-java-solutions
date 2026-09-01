class Solution {
    public boolean isValid(String str) {
        

        int len = str.length();

        if(len == 1){return(false);};

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        String open = "({[";
        String closing = "]})";

        for(int i = 0; i < len; i++)
        {
            char current = str.charAt(i);

            if(open.contains(String.valueOf(current)))
                stack.push(str.charAt(i));

            if(closing.contains(String.valueOf(current)))
            {
                if (!stack.empty() && map.get(current) == stack.peek())
                    stack.pop();
                else 
                    return(false);

            }
           

        }

        if(stack.empty())
        {
            return (true);

        } 


    return(false);

    }
}