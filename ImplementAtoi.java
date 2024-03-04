class Solution
{
    int atoi(String s) {
        int ans=0;
        boolean flag=false;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i==0 && c=='-'){
                continue;
            }else if(Character.isDigit(c)==false){
                flag=true;
                break;
            }else{
                int temp=c-'0';
                ans*=10;
                ans+=temp;
            }
        }
        
        if(flag) return -1;
        if(s.charAt(0)=='-') ans*=-1;
        return ans;}}
