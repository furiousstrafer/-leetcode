class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i:piles)
            max = Math.max(max, i);
        
        int left = 0, right = max;
        while(left <= right){
            long ans = 0;
            int mid = (left + right) / 2;
            for(int i : piles){
                ans += Math.ceil((double)i / mid);
            }
            if(ans <= h){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        
        return left;
    }
}