class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int sum = 0;
        // if sum of the array becomes the same as the previous sum at some point that means there is a point
        //where the some is becomming zero..thats why we are using hashmap to to keep the track of the sums
        
        HashSet<Integer> st = new HashSet<>();
        
        for(int i =0; i<n ; i++){
            sum  += arr[i];
            
            if(sum==0 || st.contains(sum)){
                return true;
            }
            st.add(sum);
        }
        return false;
        
    }
}//gfg
