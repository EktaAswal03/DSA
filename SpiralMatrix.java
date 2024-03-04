class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> li = new ArrayList<>();
        int total= r*c;
        int sr=0;
        int sc=0;
        int er=r-1;
        int ec=c-1;
        int count=0;
        
        while(count<total){
            for(int i =sc; count<total&&i<=ec; i++){
                li.add(matrix[sr][i]);
                count++;
            }
            sr++;
            
            for(int i=sr; count<total&&i<=er; i++){
                li.add(matrix[i][ec]);
                count++;
            }
            ec--;
            
            for(int i=ec; count<total&&i>=sc; i--){
                li.add(matrix[er][i]);
                count++;
            }
            er--;
            
            for(int i =er; count<total&&i>=sr; i--){
                li.add(matrix[i][sc]);
                count++;
            }
            sc++;
        }
        return li;
        
    }
}
