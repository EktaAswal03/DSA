class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        
        int a = 1;
        int b =0;
        
        for(int i =1; i<n ; i++){
            if(dep[b]<arr[i])b++;
            
            else if(dep[b]>=arr[i]){
                a++;
            }
        }
        return a;
        
    }
    
}
