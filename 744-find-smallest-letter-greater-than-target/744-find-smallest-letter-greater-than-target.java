class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else { //if (key >= letters[mid]) 
                start=mid+1;
            }
        }
        // since the loop is running until 'start <= end', so at the end of the while loop, 'start == end+1'
        return letters[start%n];
    }
}