// Example 1:


// Input: N = 4, sum = 2
// arr[] = {-2, 0, 1, 3}
// Output:  2
// Explanation: Below are triplets with 
// sum less than 2 (-2, 0, 1) and (-2, 0, 3). 
 

// Example 2:


// Input: N = 5, sum = 12
// arr[] = {5, 1, 3, 4, 7}
// Output: 4
// Explanation: Below are triplets with 
// sum less than 12 (1, 3, 4), (1, 3, 5), 
// (1, 3, 7) and (1, 4, 5).
  
  
class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        
        long ans = 0;
        
        Arrays.sort(arr);
        
        for(int i = 0 ; i < n - 2 ; i++){
            
            int j = i + 1;
            int k = n -1 ;
            
            while(j < k){
                if(arr[i] + arr[j] + arr[k] >= sum){
                k--;
            } else{
                ans = ans + (k-j);
                j++;
            }
          }
        }
        return ans;
    }
}
