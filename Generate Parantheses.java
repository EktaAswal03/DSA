class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int k=n;
        generate(n-1,k, ans,"(");
        return ans;
        
    }
    
    public void generate( int n , int k, List<String> ans, String str){
        if(n==0&&k==0){
            ans.add(str);
            return;
        }
        
        
        if(n!=0){
             generate (n-1, k, ans, str+"(");
        }
        if(n<k){
       
        generate( n, k-1, ans, str+")");    
    }
       
    
    }
}
