// Example 1:

// Input :
// N = 9
// Output:
// 2
// Explanation:
// 1 and 4 are the only Perfect Squares
// less than 9. So, the Output is 2.
// Example 2:

// Input :
// N = 3
// Output:
// 1
// Explanation:
// 1 is the only Perfect Square
// less than 3. So, the Output is 1.
  
  
  
  class Solution {
    static int countSquares(int N) {
        // code here
        
        int i = 1;
        int res = 1;
        
        while(res < N){
            i++;
            res = i * i;
        }
        
        return i-1;
    }
}
