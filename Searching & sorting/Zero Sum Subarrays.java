// Example 1:

// Input:
// n = 6
// arr[] = {0,0,5,5,0,0}
// Output: 6
// Explanation: The 6 subarrays are 
// [0], [0], [0], [0], [0,0], and [0,0].

// Example 2:

// Input:
// n = 10
// arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
// Output: 4
// Explanation: The 4 subarrays are [-1 -3 4]
// [-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]



class Solution{
    
    static class Pair{
        
        int first, second;
        
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long, ArrayList<Integer>> hashmap = new HashMap<>();
        ArrayList<Pair> arraylistPair = new ArrayList<>();
        
        long sum = 0;
        
        for(int i = 0 ; i < n ; i++){
            sum = sum + arr[i];
            
            ArrayList<Integer> arraylist = new ArrayList<>();
            
            if(sum == 0){
                arraylistPair.add(new Pair(0, i));    
            }
            
            if(hashmap.containsKey(sum)){
                
                arraylist = hashmap.get(sum);
                
                for(int j = 0 ; j < arraylist.size(); j++){
                    arraylistPair.add(new Pair(arraylist.get(j)+1, i));
                }
            }
            
            arraylist.add(i);
            hashmap.put(sum, arraylist);
        }
        
        return arraylistPair.size();
    }
}
