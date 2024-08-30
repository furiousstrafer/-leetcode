class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int search = target - nums[i];
            if(hashMap.containsKey(search)){
                return new int[]{i,hashMap.get(search)};
            }
            hashMap.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}