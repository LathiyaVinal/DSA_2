
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        HashMap<Integer, Integer> hashmp = new HashMap<>();
        
        
        for(int i = 0; i < size ; i++){
            
            if(hashmp.containsKey(arr[i])){
                hashmp.put(arr[i],hashmp.get(arr[i])+1);        
            }else{
                hashmp.put(arr[i], 1);
            }
            
            
            if(n == 0 && hashmp.get(arr[i]) > 1){
                return true;       
            }
        }
        
        if(n == 0){
            return false;
        }
        
        for(int i = 0; i < size ; i++){
            if(hashmp.containsKey(n + arr[i])){
                return true;
            }
        }
        
        return false;
    }
}
