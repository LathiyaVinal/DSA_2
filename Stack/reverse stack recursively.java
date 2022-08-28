class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        
        int top = s.pop();
        if(!s.isEmpty()){
            reverse(s);
        }
        push(top, s);
    }
    
    static void push(int data, Stack<Integer> s){
        
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        push(data, s);
        s.push(top);
        
    }
}
