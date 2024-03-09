class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
      Stack<Character> st = new Stack<>();
StringBuilder sb = new StringBuilder();
StringBuilder temp = new StringBuilder(); 
       
for (int i = 0; i < S.length(); i++) {
    if (S.charAt(i) != '.') {
        st.push(S.charAt(i));
    } else {
         temp = new StringBuilder(); 
        while (!st.isEmpty()) {
            temp.append(st.pop());
        }
        sb.append(temp);
        sb.append('.');
    }
}
temp = new StringBuilder();

 while (!st.isEmpty()) {
            temp.append(st.pop());
        }
        sb.append(temp);
       
       return sb.toString();

    }
}
