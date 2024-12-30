class Solution {
        public int getLargestOutlier(int[] A) {
        Map<Integer, Integer> count = new HashMap<>();
    int total = 0, res = Integer.MIN_VALUE;

    // Count the occurrences of each number and calculate the total sum
    for (int a : A) {
        total += a;
        if (count.containsKey(a)) {
            count.put(a, count.get(a) + 1);
        } else {
            count.put(a, 1);
        }
    }

    // Check for the largest outlier
    for (int a : A) {
        int outlier = total - a - a;
        int outlierCount = count.containsKey(outlier) ? count.get(outlier) : 0;
        if (outlier == a) {
            if (outlierCount > 1) {
                res = Math.max(res, outlier);
            }
        } else {
            if (outlierCount > 0) {
                res = Math.max(res, outlier);
            }
        }
    }

    return res;
    }
}