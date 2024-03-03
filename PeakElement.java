class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int peak=0;
       
       if (n ==1){
           return 0;
       }
       
       for(int i =1; i<n-1 ; i++){
           if(arr[i]>=arr[i-1]&& arr[i]>=arr[i+1]){
               peak=i;
           }
           
       }
       
       if(arr[n-1]>=arr[n-2]){
           peak=n-1;
       }
       
       return peak;
    }
}
