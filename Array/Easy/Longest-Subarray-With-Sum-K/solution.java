// User function Template for Java
import java.util.*;
class solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            
            if(sum==k){
                maxlen=i+1;
            }else{
                int remaining=sum-k;
                
                if(map.containsKey(remaining)){
                    int len=i-map.get(remaining);
                    maxlen=Math.max(maxlen,len);
                    
                }
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        
        return maxlen;
        
        
    }
}
