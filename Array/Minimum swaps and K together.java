// Example 1:

// Input : 
// arr[ ] = {2, 1, 5, 6, 3} 
// K = 3
// Output : 
// 1
// Explanation:
// To bring elements 2, 1, 3 together,
// swap index 2 with 4 (0-based indexing),
// i.e. element arr[2] = 5 with arr[4] = 3
// such that final array will be- 
// arr[] = {2, 1, 3, 6, 5}


// Description : count all numbers which are >= k. 
// and use sliding window approach. 

class Complete {

    // Function for finding maximum and value pair
    public static int minSwap(int arr[], int n, int k) {

        int badCount = 0;
        int count = 0;

        int finalMinSwap = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                badCount++;
            }
        }

        finalMinSwap = badCount;

        for (int i = 1, j = count; j < n; i++, j++) {
            if (arr[i - 1] > k) {
                badCount--;
            }
            if (arr[j] > k) {
                badCount++;
            }

            finalMinSwap = Math.min(finalMinSwap, badCount);
        }

        return finalMinSwap;
    }
}
