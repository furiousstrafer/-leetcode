class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right)
        {
            if(max < (right - left) * Math.min(height[right],height[left]))
                max = (right - left) * Math.min(height[right],height[left]);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}