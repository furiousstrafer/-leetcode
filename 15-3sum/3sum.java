class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length-1;
            

            while(l < r){
                if(nums[l] + nums[r] + nums[i] < 0){
                    l++;
                }else if(nums[l] + nums[r] + nums[i] > 0){
                    r--;
                } else{
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;

                    while(nums[l] == nums[l - 1] && l < r){
                        l++;
                    }
                }
            }
        }
            
        return ans;
    }
}