class Solution {
    public int evalRPN(String[] A) {
        int n = A.length;
        int secondLast;
        int last;

        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i<n; i++){
            String str = A[i];

            if (str.equals("+")){
                last = s.pop();
                secondLast = s.pop();
                s.push(last + secondLast);
            }
            else if (str.equals("*")){
                last = s.pop();
                secondLast = s.pop();
                s.push(last*secondLast);
            }
            else if (str.equals("/")){
                last = s.pop();
                secondLast = s.pop();
                s.push(secondLast/last);
            }
            else if (str.equals("-")){
                last = s.pop();
                secondLast = s.pop();
                s.push(secondLast - last);
            }
            else {
                secondLast = Integer.parseInt(str);
                s.push(secondLast);
            }
        }
        return s.peek();       
    }
}