// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int n=nums.length;
        Pair[] arr=new Pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new Pair(nums[i],i);
        }
        Arrays.sort(arr);
        int minSwap=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(arr[i].idx==i || visited[i]==true) continue;
            
            int cycleLen=0;
            int j=i;
            while(visited[j]==false){
                visited[j]=true;
                cycleLen++;
                j=arr[j].idx;
            }
            minSwap+=(cycleLen-1);
        }
        return minSwap;
    }
    
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        public Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p){
            return this.val-p.val;
        }
    }
}