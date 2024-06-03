class Solution {
    public int calculate(String s) {
       Stack<Integer> stack = new Stack<>();
        int num = 0;
        int sign = 1;  // 1 means positive, -1 means negative
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                result += sign * num;
                num = 0;
                i--;  // to counter the extra increment in the inner while loop
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result = result * stack.pop() + stack.pop();
            }
        }

        return result;
    }
}