class Solution:
    #Back-end complete function Template for Python 3
    
    #Function to find the leaders in the array.
    def leaders(self, A, N):
        #Code here
        mx= A[N-1]
        leader=[]
        
        for i in range(N-1, -1, -1):
           if mx<=A[i]:
               leader.append(A[i])
               mx=A[i]
        return leader[::-1]
