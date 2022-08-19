// Example 1:

// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.
// Example 2:

// Input:
// N = 3
// Arr[] = {1, 3, 3}
// Output: 3 2
// Explanation: Repeating number is 3 and 
// smallest positive missing number is 2.



class Solve {
    int[] findTwoElement(int arr[], int n) {

        int[] output = new int[2];
        
        Arrays.sort(arr);
        int missingNumber = -1;
        int repeatingNumber = -1;
        int count = 0;
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i = 1 ; i <= n ; i++){
            
            if(hashmap.containsKey(arr[i-1])){
                repeatingNumber = arr[i-1];
            }else{
                count++;
                hashmap.put(arr[i-1], 1);
            }
            
            if(!hashmap.containsKey(count) && missingNumber == -1){
                missingNumber = count;
            }
            
            if(repeatingNumber != -1){
                output[0] = repeatingNumber;
            }
            
             if(missingNumber != -1){
                output[1] = missingNumber;
            }
            
            if(missingNumber != -1 && repeatingNumber != -1){
                break;
            }
        }
        
        if(missingNumber == -1){
          output[1] = n;
        }
        return output;
        
        
         
    }
}
